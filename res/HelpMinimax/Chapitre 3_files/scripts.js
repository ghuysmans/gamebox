
/*
	Arata raspunsul la o intrebare intr-o fereastra mica (500x300).
*/

function show_response(chapter, name)
{
	window.open(name,"Response","toolbar=no,scrollbars=no,width=500,height=300")
}

/*
	Arata raspunsul la o intrebare intr-o fereastra mare (800x400) cu scroll vertical.
*/

function show_response_bw(chapter, name)
{
	window.open(name,"Response","toolbar=no,scrollbars=yes,width=800,height=400")
}
