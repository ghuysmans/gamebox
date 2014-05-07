#!/bin/sh

TMPFILE=$2.tgz
ARCHIVE=arc/$2.`date +%y%m%d-%H%M%S`.tgz


#HELP! I can't figure out why the following condition doesn't work...
#if [ $# -lt 2 ] -o [ "$3" != "" && "$3" != "-s" ]; then 
if [ $# -lt 2 ]; then 
    echo "Usage: package.sh dest NAME [-s]"
    echo "Create a package ready to be zipped & sent to UMONS servers"
    echo "by Guillaume HUYSMANS, 2014. License: GNU GPL v2"
    echo ""
    echo "Arguments:  dest    destination root folder formatted this way:"
    echo "                    c:\\yourFolder\\ -> /c/yourFolder"
    echo "            NAME    your name, UPPERCASE"
    echo "Flags:      -s      sign a .tgz archive using GPG"
    exit
fi


echo "Cleaning the destination folder..."
mkdir -p $1/$2
rm -R $1/$2

echo "Copying source code..."
mkdir -p $1/$2/code
cp -R code/be $1/$2/code
echo "Copying libraries..."
cp -R lib $1/$2
echo "Copying resources..."
cp -R res $1/$2
rm -R $1/$2/res/**/*.psd
rm -R $1/$2/res/*.psd
echo "Copying the PDF report..."
cp doc/official_fr/main.pdf $1/$2/rapport.pdf
echo "Copying the Ant build file..."
cp build.xml $1/$2


if [ "$3" == "-s" ]; then 
    echo "Archiving the destination directory..."
    mkdir -p arc
    pushd $1
    tar -czf $TMPFILE $2
    popd
    mv $1/$TMPFILE $ARCHIVE
    echo "Signing the archive..."
    gpg --detach-sign -a $ARCHIVE
fi


echo "Done."

