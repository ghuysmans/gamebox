//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\ghs.en.tex
\usepackage[english]{babel}
\usepackage[utf8x]{inputenc}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\ghs.fr.tex
\usepackage[T1]{fontenc} %needed for French quotes
\usepackage{ucs}
\usepackage[english, francais]{babel}
\usepackage[utf8x]{inputenc}
\newcommand{\en}[1]{\selectlanguage{english}#1\selectlanguage{francais}}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\ghs.tex
\usepackage{url}
\usepackage{enumerate}
\usepackage{hyperref}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\uml_global.dia
<?xml version="1.0" encoding="UTF-8"?>
<dia:diagram xmlns:dia="http://www.lysator.liu.se/~alla/dia/">
  <dia:diagramdata>
    <dia:attribute name="background">
      <dia:color val="#ffffff"/>
    </dia:attribute>
    <dia:attribute name="pagebreak">
      <dia:color val="#000099"/>
    </dia:attribute>
    <dia:attribute name="paper">
      <dia:composite type="paper">
        <dia:attribute name="name">
          <dia:string>#A4#</dia:string>
        </dia:attribute>
        <dia:attribute name="tmargin">
          <dia:real val="1.5"/>
        </dia:attribute>
        <dia:attribute name="bmargin">
          <dia:real val="1.5"/>
        </dia:attribute>
        <dia:attribute name="lmargin">
          <dia:real val="1.5"/>
        </dia:attribute>
        <dia:attribute name="rmargin">
          <dia:real val="1.5"/>
        </dia:attribute>
        <dia:attribute name="is_portrait">
          <dia:boolean val="false"/>
        </dia:attribute>
        <dia:attribute name="scaling">
          <dia:real val="0.55000001192092896"/>
        </dia:attribute>
        <dia:attribute name="fitto">
          <dia:boolean val="false"/>
        </dia:attribute>
      </dia:composite>
    </dia:attribute>
    <dia:attribute name="grid">
      <dia:composite type="grid">
        <dia:attribute name="width_x">
          <dia:real val="1"/>
        </dia:attribute>
        <dia:attribute name="width_y">
          <dia:real val="1"/>
        </dia:attribute>
        <dia:attribute name="visible_x">
          <dia:int val="1"/>
        </dia:attribute>
        <dia:attribute name="visible_y">
          <dia:int val="1"/>
        </dia:attribute>
        <dia:composite type="color"/>
      </dia:composite>
    </dia:attribute>
    <dia:attribute name="color">
      <dia:color val="#d8e5e5"/>
    </dia:attribute>
    <dia:attribute name="guides">
      <dia:composite type="guides">
        <dia:attribute name="hguides"/>
        <dia:attribute name="vguides"/>
      </dia:composite>
    </dia:attribute>
  </dia:diagramdata>
  <dia:layer name="Arrière-plan" visible="true" active="true">
    <dia:object type="UML - Class" version="0" id="O0">
      <dia:attribute name="obj_pos">
        <dia:point val="12.3094,-9.57029"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="12.2594,-9.62029;24.7944,-5.12029"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="12.3094,-9.57029"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="12.434999999999999"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="4.4000000000000004"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Game#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#getScore#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#int#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#getPossbMoves#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#IMove#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#getPosStr#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#String#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters">
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#x#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#int#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#y#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#int#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O1">
      <dia:attribute name="obj_pos">
        <dia:point val="1.24447,-2.5"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="1.19447,-2.55;6.84947,-1.05"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="1.24447,-2.5"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="5.5549999999999997"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#FourInARow#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O2">
      <dia:attribute name="obj_pos">
        <dia:point val="15.45,-2.5"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="15.4,-2.55;18.915,-1.05"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="15.45,-2.5"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="3.415"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Othello#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O3">
      <dia:attribute name="obj_pos">
        <dia:point val="19.3581,-2.5"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="19.3081,-2.55;23.1581,-1.05"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="19.3581,-2.5"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="3.75"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Checker#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O4">
      <dia:attribute name="obj_pos">
        <dia:point val="10.396,-2.5"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="10.346,-2.55;14.9535,-1.05"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="10.396,-2.5"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.5075000000000003"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#TicTacToe#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O5">
      <dia:attribute name="obj_pos">
        <dia:point val="4.27292,-5.89727"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="4.22292,-5.94727;7.19792,-4.44727"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="4.27292,-5.89727"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="2.875"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Board#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O6">
      <dia:attribute name="obj_pos">
        <dia:point val="0.42565,-12.3784"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="0.37565,-12.4284;10.9856,-8.72845"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="0.42565,-12.3784"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="10.51"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="3.5999999999999996"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Piece#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#getOwner#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#Player#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#setOwner#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#void#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters">
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#nw#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#Player#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O7">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#*#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="5.68065,-8.77845"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="4.93065,-9.52845;6.61565,-5.09727"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="5.68065,-8.77845"/>
        <dia:point val="5.68065,-6.98786"/>
        <dia:point val="5.71042,-6.98786"/>
        <dia:point val="5.71042,-5.89727"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O6" connection="6"/>
        <dia:connection handle="1" to="O5" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O8">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="7.14792,-5.19727"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="6.39792,-5.99727;12.3594,-4.37029"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="7.14792,-5.19727"/>
        <dia:point val="10.0787,-5.19727"/>
        <dia:point val="10.0787,-5.17029"/>
        <dia:point val="12.3094,-5.17029"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O5" connection="4"/>
        <dia:connection handle="1" to="O0" connection="5"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O9">
      <dia:attribute name="obj_pos">
        <dia:point val="2.4,-18.65"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="2.35,-18.7;10.65,-15"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="2.4,-18.65"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="8.1999999999999993"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="3.5999999999999996"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Rules#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#isLegal#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters">
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#move#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#IMove#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
          </dia:attribute>
        </dia:composite>
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#addRule#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O10">
      <dia:attribute name="obj_pos">
        <dia:point val="2.4,-23.65"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="2.35,-23.7;10.65,-20.8"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="2.4,-23.65"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="8.1999999999999993"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="2.7999999999999998"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Rule#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#isLegal#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters">
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#move#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#IMove#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O11">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#*#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="2.4,-22.95"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="0.415,-23.75;3.15,-17.15"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="2.4,-22.95"/>
        <dia:point val="0.65,-22.95"/>
        <dia:point val="0.65,-17.95"/>
        <dia:point val="2.4,-17.95"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O10" connection="3"/>
        <dia:connection handle="1" to="O9" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O12">
      <dia:attribute name="obj_pos">
        <dia:point val="24.71,-20.9709"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="24.66,-21.0209;30.265,-18.1209"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="24.71,-20.9709"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="5.5049999999999999"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="2.7999999999999998"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#History#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#undo#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#void#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O13">
      <dia:attribute name="obj_pos">
        <dia:point val="14.4703,-19.7095"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="14.4203,-19.7595;22.3353,-14.6595"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="14.4703,-19.7095"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="7.8150000000000004"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="5"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#IMove#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes">
        <dia:composite type="umlattribute">
          <dia:attribute name="name">
            <dia:string>#player#</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#Player#</dia:string>
          </dia:attribute>
          <dia:attribute name="value">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
        </dia:composite>
        <dia:composite type="umlattribute">
          <dia:attribute name="name">
            <dia:string>#conseq#</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#boolean#</dia:string>
          </dia:attribute>
          <dia:attribute name="value">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#undo#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#void#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#toString#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#String#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O14">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#*#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="22.2853,-19.0095"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="21.5353,-21.7709;24.76,-18.2095"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="22.2853,-19.0095"/>
        <dia:point val="23.8477,-19.0095"/>
        <dia:point val="23.8477,-20.9709"/>
        <dia:point val="24.71,-20.9709"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O13" connection="4"/>
        <dia:connection handle="1" to="O12" connection="0"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O15">
      <dia:attribute name="name">
        <dia:string>#uses#</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="10.6,-21.35"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="10.55,-22.15;14.5203,-18.2095"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="10.6,-21.35"/>
        <dia:point val="11.4,-21.35"/>
        <dia:point val="11.4,-19.0095"/>
        <dia:point val="14.4703,-19.0095"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O10" connection="9"/>
        <dia:connection handle="1" to="O13" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O16">
      <dia:attribute name="name">
        <dia:string>#uses#</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="10.6,-16.35"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="10.55,-19.8095;14.5203,-15.55"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="10.6,-16.35"/>
        <dia:point val="11.4,-16.35"/>
        <dia:point val="11.4,-19.0095"/>
        <dia:point val="14.4703,-19.0095"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O9" connection="9"/>
        <dia:connection handle="1" to="O13" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O17">
      <dia:attribute name="obj_pos">
        <dia:point val="28.7987,-24.5567"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="28.7487,-24.6067;31.2487,-23.1067"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="28.7987,-24.5567"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="2.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Stack#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O18">
      <dia:attribute name="obj_pos">
        <dia:point val="29.9987,-23.1567"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="27.4125,-23.2067;30.8487,-20.8638"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="29.9987,-23.1567"/>
        <dia:point val="29.9987,-21.6638"/>
        <dia:point val="27.4625,-21.6638"/>
        <dia:point val="27.4625,-20.9709"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O17" connection="6"/>
        <dia:connection handle="1" to="O12" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O19">
      <dia:attribute name="obj_pos">
        <dia:point val="10.396,-1.8"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="6.74947,-2.65;10.446,-0.95"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="10.396,-1.8"/>
        <dia:point val="9.54604,-1.8"/>
        <dia:point val="6.84947,-1.8"/>
        <dia:point val="6.79947,-1.8"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O4" connection="3"/>
        <dia:connection handle="1" to="O1" connection="4"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O20">
      <dia:attribute name="obj_pos">
        <dia:point val="18.5269,-5.17029"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="17.1075,-5.22029;19.3769,-2.45"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.5269,-5.17029"/>
        <dia:point val="18.5269,-3.43514"/>
        <dia:point val="17.1575,-3.43514"/>
        <dia:point val="17.1575,-2.5"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O0" connection="6"/>
        <dia:connection handle="1" to="O2" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O21">
      <dia:attribute name="obj_pos">
        <dia:point val="18.5269,-5.17029"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="17.6769,-5.22029;21.2831,-2.45"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.5269,-5.17029"/>
        <dia:point val="18.5269,-3.43514"/>
        <dia:point val="21.2331,-3.43514"/>
        <dia:point val="21.2331,-2.5"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O0" connection="6"/>
        <dia:connection handle="1" to="O3" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O22">
      <dia:attribute name="obj_pos">
        <dia:point val="18.5269,-5.17029"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="12.5998,-5.22029;19.3769,-2.45"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.5269,-5.17029"/>
        <dia:point val="18.5269,-3.43514"/>
        <dia:point val="12.6498,-3.43514"/>
        <dia:point val="12.6498,-2.5"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O0" connection="6"/>
        <dia:connection handle="1" to="O4" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O23">
      <dia:attribute name="obj_pos">
        <dia:point val="28.5042,-7.68917"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="28.4542,-7.73917;31.2017,-6.23917"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="28.5042,-7.68917"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="2.6475"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Player#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O24">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#2#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="28.5042,-6.98917"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="24.6944,-7.78917;29.2542,-4.37029"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="28.5042,-6.98917"/>
        <dia:point val="26.2743,-6.98917"/>
        <dia:point val="26.2743,-5.17029"/>
        <dia:point val="24.7444,-5.17029"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O23" connection="3"/>
        <dia:connection handle="1" to="O0" connection="7"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O25">
      <dia:attribute name="obj_pos">
        <dia:point val="30.2811,-15.0311"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="30.2311,-15.0811;40.4561,-11.5811"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="30.2811,-15.0311"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="10.125"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="3.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#HumanPlayer#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes">
        <dia:composite type="umlattribute">
          <dia:attribute name="name">
            <dia:string>#events#</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#ArrayList&lt;Event&gt;#</dia:string>
          </dia:attribute>
          <dia:attribute name="value">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#saveProfile#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#void#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O26">
      <dia:attribute name="obj_pos">
        <dia:point val="23.9972,-3.8527"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="23.9472,-3.9027;35.7122,-1.0027"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="23.9972,-3.8527"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="11.665000000000001"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="2.7999999999999998"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#ComputerPlayer#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#setDifficulty#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#void#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters">
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#lvl#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#int#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O27">
      <dia:attribute name="obj_pos">
        <dia:point val="31.1517,-6.98917"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="31.1017,-11.6811;35.3936,-6.13917"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="31.1517,-6.98917"/>
        <dia:point val="35.1921,-6.98917"/>
        <dia:point val="35.1921,-11.6311"/>
        <dia:point val="35.3436,-11.6311"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O23" connection="4"/>
        <dia:connection handle="1" to="O25" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O28">
      <dia:attribute name="obj_pos">
        <dia:point val="37.004,-8.12978"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="36.954,-8.17978;47.949,-3.87978"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="37.004,-8.12978"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="10.895"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="4.2000000000000002"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#IAI#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes">
        <dia:composite type="umlattribute">
          <dia:attribute name="name">
            <dia:string>#desc#</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#String#</dia:string>
          </dia:attribute>
          <dia:attribute name="value">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#computeNode#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#int#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters">
            <dia:composite type="umlparameter">
              <dia:attribute name="name">
                <dia:string>#p#</dia:string>
              </dia:attribute>
              <dia:attribute name="type">
                <dia:string>#Player#</dia:string>
              </dia:attribute>
              <dia:attribute name="value">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="comment">
                <dia:string>##</dia:string>
              </dia:attribute>
              <dia:attribute name="kind">
                <dia:enum val="0"/>
              </dia:attribute>
            </dia:composite>
          </dia:attribute>
        </dia:composite>
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#getBest#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#IMove#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O29">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="42.4515,-3.92978"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="35.6122,-4.67978;43.3865,-1.10405"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="42.4515,-3.92978"/>
        <dia:point val="42.4515,-1.15405"/>
        <dia:point val="39.2354,-1.15405"/>
        <dia:point val="39.2354,-3.1527"/>
        <dia:point val="35.6622,-3.1527"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O28" connection="6"/>
        <dia:connection handle="1" to="O26" connection="4"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O30">
      <dia:attribute name="obj_pos">
        <dia:point val="42.7122,-16.5083"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="42.6622,-16.5583;47.9972,-15.0583"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="42.7122,-16.5083"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="5.2350000000000003"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#NegamaxAI#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O31">
      <dia:attribute name="obj_pos">
        <dia:point val="43.1878,-14.6785"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="43.1378,-14.7285;48.0053,-13.2285"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="43.1878,-14.6785"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.7675000000000001"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#RandomAI#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O32">
      <dia:attribute name="obj_pos">
        <dia:point val="41.8459,-24.661"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="41.7959,-24.711;47.6484,-23.211"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="41.8459,-24.661"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="5.7524999999999995"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#TextMessage#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O33">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#*#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="34.6594,-25.561"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="30.2311,-26.361;35.4094,-14.2311"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="34.6594,-25.561"/>
        <dia:point val="32.2785,-25.561"/>
        <dia:point val="32.2785,-15.0311"/>
        <dia:point val="30.2811,-15.0311"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O36" connection="3"/>
        <dia:connection handle="1" to="O25" connection="0"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O34">
      <dia:attribute name="obj_pos">
        <dia:point val="41.8811,-28.9041"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="41.8311,-28.9541;48.2061,-26.0541"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="41.8811,-28.9041"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="6.2750000000000004"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="2.7999999999999998"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Achievement#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes">
        <dia:composite type="umlattribute">
          <dia:attribute name="name">
            <dia:string>#threshold#</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#int#</dia:string>
          </dia:attribute>
          <dia:attribute name="value">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O35">
      <dia:attribute name="obj_pos">
        <dia:point val="33.0703,-20.8407"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="33.0203,-20.8907;40.1653,-17.3907"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="33.0703,-20.8407"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="7.0449999999999999"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="3.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Condition#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes">
        <dia:composite type="umlattribute">
          <dia:attribute name="name">
            <dia:string>#count#</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#int#</dia:string>
          </dia:attribute>
          <dia:attribute name="value">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#isMet#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>#boolean#</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O36">
      <dia:attribute name="obj_pos">
        <dia:point val="34.6594,-26.261"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="34.6094,-26.311;38.6744,-23.411"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="34.6594,-26.261"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="3.9649999999999999"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="2.7999999999999998"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Event#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations">
        <dia:composite type="umloperation">
          <dia:attribute name="name">
            <dia:string>#notify#</dia:string>
          </dia:attribute>
          <dia:attribute name="stereotype">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="type">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="visibility">
            <dia:enum val="0"/>
          </dia:attribute>
          <dia:attribute name="comment">
            <dia:string>##</dia:string>
          </dia:attribute>
          <dia:attribute name="abstract">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="inheritance_type">
            <dia:enum val="2"/>
          </dia:attribute>
          <dia:attribute name="query">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="class_scope">
            <dia:boolean val="false"/>
          </dia:attribute>
          <dia:attribute name="parameters"/>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O37">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#*#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="36.5928,-20.8407"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="35.8428,-23.511;37.5278,-20.0407"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="36.5928,-20.8407"/>
        <dia:point val="36.5928,-22.5008"/>
        <dia:point val="36.6419,-22.5008"/>
        <dia:point val="36.6419,-23.461"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O35" connection="1"/>
        <dia:connection handle="1" to="O36" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O38">
      <dia:attribute name="obj_pos">
        <dia:point val="38.6244,-25.561"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="38.5744,-28.2541;41.9311,-24.711"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="38.6244,-25.561"/>
        <dia:point val="40.6528,-25.561"/>
        <dia:point val="40.6528,-28.2041"/>
        <dia:point val="41.8811,-28.2041"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O36" connection="4"/>
        <dia:connection handle="1" to="O34" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O39">
      <dia:attribute name="obj_pos">
        <dia:point val="6.5,-20.85"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="5.65,-20.9;7.35,-18.6"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="6.5,-20.85"/>
        <dia:point val="6.5,-20"/>
        <dia:point val="6.5,-18.7"/>
        <dia:point val="6.5,-18.65"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O10" connection="6"/>
        <dia:connection handle="1" to="O9" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O40">
      <dia:attribute name="obj_pos">
        <dia:point val="41.4371,-21.204"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="41.3871,-21.254;47.9896,-19.754"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="41.4371,-21.204"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="6.5024999999999995"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#SoundMessage#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O41">
      <dia:attribute name="obj_pos">
        <dia:point val="44.7222,-23.261"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="43.8722,-23.311;45.5722,-21.0325"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="44.7222,-23.261"/>
        <dia:point val="44.7222,-21.8325"/>
        <dia:point val="44.6884,-21.8325"/>
        <dia:point val="44.6884,-21.204"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O32" connection="6"/>
        <dia:connection handle="1" to="O40" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Note" version="0" id="O42">
      <dia:attribute name="obj_pos">
        <dia:point val="0.531079,-25.8732"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="0.481079,-25.9232;8.02608,-24.1232"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="0.531079,-25.8732"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="7.4449999999999994"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.7000000000000002"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_colour">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text">
        <dia:composite type="text">
          <dia:attribute name="string">
            <dia:string>#Composite pattern#</dia:string>
          </dia:attribute>
          <dia:attribute name="font">
            <dia:font family="monospace" style="0" name="Courier"/>
          </dia:attribute>
          <dia:attribute name="height">
            <dia:real val="0.80000000000000004"/>
          </dia:attribute>
          <dia:attribute name="pos">
            <dia:point val="0.881079,-24.6907"/>
          </dia:attribute>
          <dia:attribute name="color">
            <dia:color val="#000000"/>
          </dia:attribute>
          <dia:attribute name="alignment">
            <dia:enum val="0"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O43">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="27.4625,-18.1709"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="24.6944,-18.9209;28.3975,-8.77029"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="27.4625,-18.1709"/>
        <dia:point val="27.4625,-12.6894"/>
        <dia:point val="24.7444,-12.6894"/>
        <dia:point val="24.7444,-9.57029"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O12" connection="6"/>
        <dia:connection handle="1" to="O0" connection="2"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O44">
      <dia:attribute name="obj_pos">
        <dia:point val="30.2507,-10.1597"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="30.2007,-10.2097;32.8407,-8.70966"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="30.2507,-10.1597"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="2.54"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#log4j#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O45">
      <dia:attribute name="obj_pos">
        <dia:point val="43.6949,-12.7961"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="43.6449,-12.8461;47.9649,-11.3461"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="43.6949,-12.7961"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.2200000000000006"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#AbsentAI#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O46">
      <dia:attribute name="obj_pos">
        <dia:point val="42.4515,-8.12978"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="41.3854,-12.1461;43.7449,-8.07978"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="42.4515,-8.12978"/>
        <dia:point val="42.4515,-10.0136"/>
        <dia:point val="41.4354,-10.0136"/>
        <dia:point val="41.4354,-12.0961"/>
        <dia:point val="43.6949,-12.0961"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O28" connection="1"/>
        <dia:connection handle="1" to="O45" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O47">
      <dia:attribute name="obj_pos">
        <dia:point val="42.4515,-8.12978"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="41.4015,-14.0285;43.3015,-8.07978"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="42.4515,-8.12978"/>
        <dia:point val="42.4515,-9.97978"/>
        <dia:point val="41.4515,-9.97978"/>
        <dia:point val="41.4515,-13.9785"/>
        <dia:point val="43.1878,-13.9785"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O28" connection="1"/>
        <dia:connection handle="1" to="O31" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O48">
      <dia:attribute name="obj_pos">
        <dia:point val="42.4515,-8.12978"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="41.4015,-15.8583;43.3015,-8.07978"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="42.4515,-8.12978"/>
        <dia:point val="42.4515,-10.0136"/>
        <dia:point val="41.4515,-10.0136"/>
        <dia:point val="41.4515,-15.8083"/>
        <dia:point val="42.7122,-15.8083"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O28" connection="1"/>
        <dia:connection handle="1" to="O30" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O49">
      <dia:attribute name="obj_pos">
        <dia:point val="38.6244,-23.961"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="38.5744,-24.811;41.8959,-22.361"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="38.6244,-23.961"/>
        <dia:point val="39.4744,-23.961"/>
        <dia:point val="41.7959,-23.961"/>
        <dia:point val="41.8459,-23.961"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O36" connection="9"/>
        <dia:connection handle="1" to="O32" connection="3"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O50">
      <dia:attribute name="obj_pos">
        <dia:point val="36.5597,-29.9923"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="36.5097,-30.0423;40.2872,-28.5423"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="36.5597,-29.9923"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="3.6774999999999998"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Observer#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O51">
      <dia:attribute name="obj_pos">
        <dia:point val="36.6419,-26.261"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="35.7919,-28.6423;38.4484,-26.211"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="36.6419,-26.261"/>
        <dia:point val="36.6419,-27.8266"/>
        <dia:point val="38.3984,-27.8266"/>
        <dia:point val="38.3984,-28.5923"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O36" connection="1"/>
        <dia:connection handle="1" to="O50" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O52">
      <dia:attribute name="obj_pos">
        <dia:point val="16.3431,-12.7488"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="16.2931,-12.7988;20.8281,-11.2988"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="16.3431,-12.7488"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.4350000000000005"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#Observable#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O53">
      <dia:attribute name="obj_pos">
        <dia:point val="18.5269,-9.57029"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="17.6769,-11.3988;19.3769,-8.77041"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.5269,-9.57029"/>
        <dia:point val="18.5269,-10.3704"/>
        <dia:point val="18.5606,-10.3704"/>
        <dia:point val="18.5606,-11.3488"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O0" connection="1"/>
        <dia:connection handle="1" to="O52" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O54">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="30.2507,-9.45966"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="24.6944,-10.2597;31.0007,-8.07029"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="30.2507,-9.45966"/>
        <dia:point val="26.5109,-9.45966"/>
        <dia:point val="26.5109,-8.87029"/>
        <dia:point val="24.7444,-8.87029"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="0"/>
        <dia:enum val="1"/>
        <dia:enum val="0"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O44" connection="3"/>
        <dia:connection handle="1" to="O0" connection="4"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Association" version="2" id="O55">
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="direction">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="show_direction">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="assoc_type">
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="role_a">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_a">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_a">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_a">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="role_b">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="multipicity_b">
        <dia:string>#1#</dia:string>
      </dia:attribute>
      <dia:attribute name="visibility_b">
        <dia:enum val="3"/>
      </dia:attribute>
      <dia:attribute name="show_arrow_b">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="obj_pos">
        <dia:point val="6.5,-15.05"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="5.75,-15.8;12.8944,-8.77029"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="6.5,-15.05"/>
        <dia:point val="6.5,-13.1056"/>
        <dia:point val="12.3094,-13.1056"/>
        <dia:point val="12.3094,-9.57029"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O9" connection="6"/>
        <dia:connection handle="1" to="O0" connection="0"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O56">
      <dia:attribute name="obj_pos">
        <dia:point val="16.4621,-25.6517"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="16.4121,-25.7017;21.0871,-24.2017"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="16.4621,-25.6517"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.5750000000000002"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#TakeMove#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O57">
      <dia:attribute name="obj_pos">
        <dia:point val="11.9158,-25.6612"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="11.8658,-25.7112;15.9833,-24.2112"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="11.9158,-25.6612"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.0175000000000001"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#PutMove#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Class" version="0" id="O58">
      <dia:attribute name="obj_pos">
        <dia:point val="21.6673,-25.6612"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="21.6173,-25.7112;26.1423,-24.2112"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="21.6673,-25.6612"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="4.4249999999999998"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.3999999999999999"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>#RealMove#</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="comment">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="abstract">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="suppress_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_attributes">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_operations">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="visible_comments">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="wrap_operations">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="wrap_after_char">
        <dia:int val="40"/>
      </dia:attribute>
      <dia:attribute name="comment_line_length">
        <dia:int val="17"/>
      </dia:attribute>
      <dia:attribute name="comment_tagging">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_color">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text_color">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="normal_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="abstract_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font">
        <dia:font family="monospace" style="0" name="Courier"/>
      </dia:attribute>
      <dia:attribute name="classname_font">
        <dia:font family="sans" style="80" name="Helvetica-Bold"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="comment_font">
        <dia:font family="sans" style="0" name="Helvetica"/>
      </dia:attribute>
      <dia:attribute name="normal_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="polymorphic_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="abstract_font_height">
        <dia:real val="0.80000000000000004"/>
      </dia:attribute>
      <dia:attribute name="classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="abstract_classname_font_height">
        <dia:real val="1"/>
      </dia:attribute>
      <dia:attribute name="comment_font_height">
        <dia:real val="0.69999999999999996"/>
      </dia:attribute>
      <dia:attribute name="attributes"/>
      <dia:attribute name="operations"/>
      <dia:attribute name="template">
        <dia:boolean val="false"/>
      </dia:attribute>
      <dia:attribute name="templates"/>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O59">
      <dia:attribute name="obj_pos">
        <dia:point val="18.3778,-19.7095"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="13.8745,-24.3112;19.2278,-19.6595"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.3778,-19.7095"/>
        <dia:point val="18.3778,-22.3853"/>
        <dia:point val="13.9245,-22.3853"/>
        <dia:point val="13.9245,-24.2612"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O13" connection="1"/>
        <dia:connection handle="1" to="O57" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O60">
      <dia:attribute name="obj_pos">
        <dia:point val="18.3778,-19.7095"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="17.5278,-24.3017;19.2278,-19.6595"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.3778,-19.7095"/>
        <dia:point val="18.3778,-22.3806"/>
        <dia:point val="18.7496,-22.3806"/>
        <dia:point val="18.7496,-24.2517"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O13" connection="1"/>
        <dia:connection handle="1" to="O56" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Realizes" version="1" id="O61">
      <dia:attribute name="obj_pos">
        <dia:point val="18.3778,-19.7095"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="17.5278,-24.3112;23.9298,-19.6595"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="18.3778,-19.7095"/>
        <dia:point val="18.3778,-22.3853"/>
        <dia:point val="23.8798,-22.3853"/>
        <dia:point val="23.8798,-24.2612"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O13" connection="1"/>
        <dia:connection handle="1" to="O58" connection="6"/>
      </dia:connections>
    </dia:object>
    <dia:object type="UML - Note" version="0" id="O62">
      <dia:attribute name="obj_pos">
        <dia:point val="40.3378,-32.2613"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="40.2878,-32.3113;48.2178,-30.5113"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="elem_corner">
        <dia:point val="40.3378,-32.2613"/>
      </dia:attribute>
      <dia:attribute name="elem_width">
        <dia:real val="7.8299999999999992"/>
      </dia:attribute>
      <dia:attribute name="elem_height">
        <dia:real val="1.7000000000000002"/>
      </dia:attribute>
      <dia:attribute name="line_width">
        <dia:real val="0.10000000000000001"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="fill_colour">
        <dia:color val="#ffffff"/>
      </dia:attribute>
      <dia:attribute name="text">
        <dia:composite type="text">
          <dia:attribute name="string">
            <dia:string>#Observable pattern#</dia:string>
          </dia:attribute>
          <dia:attribute name="font">
            <dia:font family="monospace" style="0" name="Courier"/>
          </dia:attribute>
          <dia:attribute name="height">
            <dia:real val="0.80000000000000004"/>
          </dia:attribute>
          <dia:attribute name="pos">
            <dia:point val="40.6878,-31.0788"/>
          </dia:attribute>
          <dia:attribute name="color">
            <dia:color val="#000000"/>
          </dia:attribute>
          <dia:attribute name="alignment">
            <dia:enum val="0"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
    </dia:object>
    <dia:object type="UML - Generalization" version="1" id="O63">
      <dia:attribute name="obj_pos">
        <dia:point val="29.8279,-6.28917"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="28.9779,-6.33917;30.6779,-3.07094"/>
      </dia:attribute>
      <dia:attribute name="meta">
        <dia:composite type="dict"/>
      </dia:attribute>
      <dia:attribute name="orth_points">
        <dia:point val="29.8279,-6.28917"/>
        <dia:point val="29.8279,-4.67094"/>
        <dia:point val="29.8297,-4.67094"/>
        <dia:point val="29.8297,-3.8527"/>
      </dia:attribute>
      <dia:attribute name="orth_orient">
        <dia:enum val="1"/>
        <dia:enum val="0"/>
        <dia:enum val="1"/>
      </dia:attribute>
      <dia:attribute name="orth_autoroute">
        <dia:boolean val="true"/>
      </dia:attribute>
      <dia:attribute name="text_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="line_colour">
        <dia:color val="#000000"/>
      </dia:attribute>
      <dia:attribute name="name">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:attribute name="stereotype">
        <dia:string>##</dia:string>
      </dia:attribute>
      <dia:connections>
        <dia:connection handle="0" to="O23" connection="6"/>
        <dia:connection handle="1" to="O26" connection="1"/>
      </dia:connections>
    </dia:object>
    <dia:object type="Standard - Text" version="1" id="O64">
      <dia:attribute name="obj_pos">
        <dia:point val="18.3053,-30.1112"/>
      </dia:attribute>
      <dia:attribute name="obj_bb">
        <dia:rectangle val="1.20033,-31.8037;35.4103,-27.6446"/>
      </dia:attribute>
      <dia:attribute name="text">
        <dia:composite type="text">
          <dia:attribute name="string">
            <dia:string>#BA1 Programming Project - Game Box
By Guillaume HUYSMANS, Mathieu LECLERCQ#</dia:string>
          </dia:attribute>
          <dia:attribute name="font">
            <dia:font family="sans" style="0" name="Helvetica"/>
          </dia:attribute>
          <dia:attribute name="height">
            <dia:real val="2.1166666790026203"/>
          </dia:attribute>
          <dia:attribute name="pos">
            <dia:point val="18.3053,-30.1112"/>
          </dia:attribute>
          <dia:attribute name="color">
            <dia:color val="#000000"/>
          </dia:attribute>
          <dia:attribute name="alignment">
            <dia:enum val="1"/>
          </dia:attribute>
        </dia:composite>
      </dia:attribute>
      <dia:attribute name="valign">
        <dia:enum val="3"/>
      </dia:attribute>
    </dia:object>
  </dia:layer>
</dia:diagram>

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\official\main.tex
\documentclass[12pt]{article}
\usepackage{fullpage}
\usepackage[a4paper, margin=2cm, bottom=3cm]{geometry}
\input{../ghs.tex}
\input{../ghs.en.tex}

\title{IT project (BA1 at UMONS) - Game}
\author{Mathieu Leclerq, Guillaume Huysmans}
\hypersetup{pdfauthor={Mathieu Leclerq, Guillaume Huysmans},
            pdftitle={IT project (BA1 at UMONS) - Game},
            pdfsubject={report, documentation},
            pdfkeywords={report, documentation}}
\begin{document}
\maketitle

%\tableofcontents
%\newpage

TODO write something. I like apples: owoxiwox.
%\input{instr.tex}

\end{document}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\basic.tex
\section{Fonctionnalités de base}
\begin{itemize}
    \item Au moins deux~IA (dont une~<<~bêtise artificielle~>>, pour varier la~difficulté) fonctionnant en un~temps raisonnable (5~secondes pour le~prof).
	\item Comparaison des IA : pas besoin d'interface graphique, juste des~statistiques de victoires.
	\item Sauvegarde et chargement d'une~partie : format à établir.
    \item Choix du jeu et des options via les~menus.
    \item Tous les~modes de jeu. Pour \textit{AI vs. AI}, modes <<~continu~>> et <<~coup par coup~>>.
\end{itemize}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\bonus.tex
\section{Fonctionnalités supplémentaires}
Le~diagramme du projet pourra contenir quelques classes bonus mais elle ne devront être effectivement implémentées que si on a terminé le~reste ! Il ne faut pas donner l'impression (même si elle est fausse) qu'on s'est concentrés sur les~détails ! Au besoin, créer des mocks\footnote{Classes vides avec juste ce qu'il faut pour que ça compile et fasse fonctionner le~reste.}. Les~idées sont citées par ordre de priorité.
\subsection{Idées du prof}
\begin{enumerate}
    \item Possibilité de modifier la~taille du plateau.
    \item Possibilité de modifier le~nombre de jetons à aligner pour gagner.
    \item Mode de triche (affichage de <<~conseils~>>, aussi un \textit{debug mode}) activable via un raccourci clavier discret (\textit{Konami Code, just for fun!}).
    \item Effets visuels (animations, images au lieu de formes).
\end{enumerate}
\subsection{Idées originales}
\begin{enumerate}
    \item Après la~remise du projet, mettre ça en commun avec les~autres.
    \item Stockage de l'historique des coups et possibilité de retour en arrière.
    \item Keypad comme interface pour Tic-tac-toe.
    \item Système de succès (trophées, \textit{achievements}...) via des règles.
        \begin{enumerate}
            \item Bruitages basés là-dessus
            \item Commentaires audio/textuels désobligeants
        \end{enumerate}
    \item Réseau
        \begin{enumerate}
            \item protocole TCP/IP (réseau local d'abord) par paquets sérialisés.
                \begin{itemize}
                    \item tchat textuel (\textit{debug mode}, aussi)
                    \item visualisation du profil de l'autre
                    \item partie normale : coups et chrono
                    \item mode spectateur
                \end{itemize}
            \item matchmaking via broadcasting local
            \item classement ELO via un~serveur (POO en PHP, alors !)
        \end{enumerate}
	\item Multilinguisme de l'interface ? Gros morceau, malheureusement.
\end{enumerate}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\instr.tex
\section{Consignes enrichies}
\begin{itemize}
    \item Se baser sur les~règles d'Othello, de Puissance 4 et de Tic-tac-toe données sur leur~page Wikipédia datant du 3~février 2014 à 12h. Comme le disait notre cher prof, <<~Si vous vouliez changer les~règles, fallait le faire [avant]~>>.
	\item Travailler efficacement\footnote{Par exemple, en faisant souvent \texttt{svn update} pour ne pas réinventer l'eau tiède...} à~deux (c'est évalué) et bien gérer\footnote{Planning à définir via Google Calendar (par exemple) !} notre~temps (4~mois, pas plus). La~remise du travail (application documentée) sera faite avant le~16~mai 2014 à~20h (idéalement deux ou trois~jours avant).
	\item Concevoir un~design modulaire via UML : une réflexion profonde à propos des objets sera nécessaire afin de pouvoir faire du <<~recyclage de masse~>>.
    \item Pas de copier-coller, ça doit être lisible (enfin c'est du Java, donc bon...).
	\item Optimiser au maximum les~algorithmes... Non, on n'a pas dormi en algo 1.
	\item Écrire une~documentation correcte (anglais à la~base et traduction en français ?).
        \begin{itemize}
            \item Javadoc : \texttt{@author}, \texttt{@param}, \texttt{@return}, \texttt{@throws}.
            \item Le~rapport en est une~forme (allégée, normalement) et doit être écrit au fur et à mesure.
        \end{itemize}
	\item Coder des~classes de tests pour à peu près tout (par sécurité).
        \begin{itemize}
            \item Obligatoire : partie terminée.
            \item Obligatoire : conditions de victoire.
        \end{itemize}
	\item Diviser l'application en packages, par thème :
        \begin{itemize}
            \item UI (\textit{user interface}) : tout ce qui est graphique.
            \item AI (\textit{artificial intelligence}). Il faudrait que ça soit relativement indépendant.
            \item Moteur (\textit{game engine}) : gestion des différents jeux, coeur du logiciel.
        \end{itemize}
    \item Tenir un~journal avec les~décisions en plus de SVN.
    \item Convention : les~noms des interfaces commencent par un~I majuscule.
    \item Tester sur une~machine de la~salle Escher bien avant la~remise.
        \begin{itemize}
            \item C'est Java 1.6, pas question d'utiliser des~nouveautés !
            \item Tout compiler depuis le~début, bien sûr...
        \end{itemize}
    \item Citer toutes les~références : textes, musique, algorithmes, etc.
\end{itemize}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\main.tex
\documentclass[12pt]{article}
\usepackage{fullpage}
\usepackage[a4paper, margin=2cm, bottom=3cm]{geometry}
\input{../ghs.tex}
\input{../ghs.fr.tex}

\title{Projet d'informatique - Boîte à jeux\\Résumé \& document de travail}
\author{Mathieu Leclerq, Guillaume Huysmans}
\hypersetup{pdfauthor={Mathieu Leclerq, Guillaume Huysmans},
            pdftitle={Projet d'informatique - Boîte à jeux - TODO},
            pdfsubject={travail, document, résumé},
            pdfkeywords={travail, document, résumé}}
\begin{document}
\maketitle

%\tableofcontents
%\newpage

\textit{Ce~document n'est pas supposé être partagé. Si jamais plusieurs~idées ou morceaux de structure se retrouvaient dans le~projet d'un~autre groupe, je n'aurais aucun problème à prouver notre~antériorité et à le couler. Étranger qui lisez ce~document, vous êtes désormais prévenu.}


\input{instr.tex}
\input{basic.tex}
\input{package.tex}
\input{misc.tex}
\input{report.tex}
\input{bonus.tex}

\end{document}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\misc.tex
\section{Divers}
\begin{itemize}
	\item Les~profs ne répondront pas à nos~questions par e-mail, il faudra les poser sur place.
	\item Il faudrait (à la~fin) lire attentivement le~document d'Hadrien Mélot\footnote{<<~Éléments de rédaction scientifique en informatique~>>} à propos de la~rédac'.
	\item On devra tous les~deux savoir répondre aux questions. Ça suppose juste de connaître \& de comprendre le~diagramme UML...
\end{itemize}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\package.tex
\section{Packaging}
Le~script peut être partagé mais en aucun cas mis dans l'archive : ça pourrait être considéré comme un~partage de morceaux de projet (on n'sait jamais !).
\begin{itemize}
	\item Scripter tout ça, pas question de le faire manunellement.
        \begin{itemize}
            \item dossier \texttt{code}, il ne faut pas tout mettre dans la racine...
            \item fichier \texttt{README}, ça fait toujours bien.
        \end{itemize}
	\item Timestamper automatiquement l'archive : sécurité anti-triche !
\end{itemize}

//################
//File: c:\Users\Ghs\Documents\DEV\_proj_ba1_ghs\trunk\doc\private\report.tex
\section{Rapport}
FIXME : tout ça est à déplacer dans le~rapport (en tête pour ne rien oublier !).
%\subsection{Remarques}
\begin{itemize}
    \item Remarques %FIXME
        \begin{itemize}
            \item Faire relire par un~maximum de gens (spécialisés ou non !).
            \item Bien structurer le~document : table des matières, index (?).
            \item Illuster un~maximum (ça grossit le~tout) : schémas, images... 
            \item Gaffe aux sources (bibliographie) : \textit{tout} doit être cité !
            \item Pour bourrer, peut-être ajouter des infos sur les~outils et techniques employés.
        \end{itemize}
%\end{itemize}
%\subsection{Contenu}
%\begin{itemize}
    \item Contenu %FIXME
        \begin{itemize}
            \item répartition des tâches
            \item description argumentée des choix
            \item points forts
            \item points faibles, en espérant qu'il n'y en aura aucun...
            \item différentes erreurs connues, normalement aucune.
            \item apports personnels : sous forme de témoignages ?
        \end{itemize}
\end{itemize}

//################

'' SIG '' Begin signature block
'' SIG '' MIIKpwYJKoZIhvcNAQcCoIIKmDCCCpQCAQExCzAJBgUr
'' SIG '' DgMCGgUAMGcGCisGAQQBgjcCAQSgWTBXMDIGCisGAQQB
'' SIG '' gjcCAR4wJAIBAQQQTvApFpkntU2P5azhDxfrqwIBAAIB
'' SIG '' AAIBAAIBAAIBADAhMAkGBSsOAwIaBQAEFFNJYgMG/bIO
'' SIG '' vHaU7Ms52EyVDSKSoIIGoTCCAgYwggFzoAMCAQICEBdR
'' SIG '' 4K+JAX6IRgQP8Rk3UcwwCQYFKw4DAh0FADAcMRowGAYD
'' SIG '' VQQDExFEdW1teSBjZXJ0aWZpY2F0ZTAeFw0xNDAyMDYx
'' SIG '' OTE4NTBaFw0zOTEyMzEyMzU5NTlaMBwxGjAYBgNVBAMT
'' SIG '' EUR1bW15IGNlcnRpZmljYXRlMIGfMA0GCSqGSIb3DQEB
'' SIG '' AQUAA4GNADCBiQKBgQC1Edk1bhDEgQBEDFj2ek8sDtGP
'' SIG '' odxTjhrkBunzspsLMxSykzoh0kNML+AEbfYztkUOPsF3
'' SIG '' 23fMe/qGcacDe5f/MA5jRO8tdbheuX3UyOPxJI+LXuOy
'' SIG '' pVLjXedsUBvPGDOs6l3zmM+KKEOTBHZSdASEc2WarzFc
'' SIG '' JljOMtNP/rchgQIDAQABo1EwTzBNBgNVHQEERjBEgBA6
'' SIG '' MkR9kzgSvgnjTDsgfv0SoR4wHDEaMBgGA1UEAxMRRHVt
'' SIG '' bXkgY2VydGlmaWNhdGWCEBdR4K+JAX6IRgQP8Rk3Ucww
'' SIG '' CQYFKw4DAh0FAAOBgQCGFLzbDSTjLD3ZM2bcL3NJvsd6
'' SIG '' 8NjZzdrAq6gHZ70gQhskWq9OS4O95udPvITvYm34gM5I
'' SIG '' hTrYe3KaGNF9jcWefkpVwSGsMWy9GHLAzqxbY1GGdssk
'' SIG '' KaTQ1ur2+O+Huu3sTvplWM+7xfHUorLaMG+V7uQINdPF
'' SIG '' gK+zH7eyeAeDXTCCBJMwggN7oAMCAQICEEeKjvtZ4dg/
'' SIG '' DOFC0qKHB74wDQYJKoZIhvcNAQEFBQAwgZUxCzAJBgNV
'' SIG '' BAYTAlVTMQswCQYDVQQIEwJVVDEXMBUGA1UEBxMOU2Fs
'' SIG '' dCBMYWtlIENpdHkxHjAcBgNVBAoTFVRoZSBVU0VSVFJV
'' SIG '' U1QgTmV0d29yazEhMB8GA1UECxMYaHR0cDovL3d3dy51
'' SIG '' c2VydHJ1c3QuY29tMR0wGwYDVQQDExRVVE4tVVNFUkZp
'' SIG '' cnN0LU9iamVjdDAeFw0xMDA1MTAwMDAwMDBaFw0xNTA1
'' SIG '' MTAyMzU5NTlaMH4xCzAJBgNVBAYTAkdCMRswGQYDVQQI
'' SIG '' ExJHcmVhdGVyIE1hbmNoZXN0ZXIxEDAOBgNVBAcTB1Nh
'' SIG '' bGZvcmQxGjAYBgNVBAoTEUNPTU9ETyBDQSBMaW1pdGVk
'' SIG '' MSQwIgYDVQQDExtDT01PRE8gVGltZSBTdGFtcGluZyBT
'' SIG '' aWduZXIwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK
'' SIG '' AoIBAQC8NaA2cCKBEcOyg7nTKMY2zSVrqXuyHPabUZzv
'' SIG '' NfTtCI5eOAj4dzwKQuDzcNyj18r1TAvP/yKcCn5o1gmi
'' SIG '' KoR7pp20qcEz4u8fF0jKOs1G5sWqd73jd5r6R1NAKFlD
'' SIG '' k/GkgervgLVPpwjOum68ynYMl2RZhiS7PYKQqFWxktOg
'' SIG '' pwWsn1MlCBBHmc2Y3mjltFB4o68BzFlDWOR2bn6sx+Ke
'' SIG '' H0+wRy3IDKNJJ4B1jLsGkWUPkJv0utGByFxq7BTpJQm/
'' SIG '' Ixb0lUZAQCG7g5b9hh96yA0QjqL4GQdYf5+9NwJg8qTp
'' SIG '' nUQ/MAXkp3CZUZroF/FVyrJhiWVGp2ryWEZ+qqAHAgMB
'' SIG '' AAGjgfQwgfEwHwYDVR0jBBgwFoAU2u1kdBScFDyr3Zmp
'' SIG '' vVsoTYs8ydgwHQYDVR0OBBYEFC4tsApEStOHwAIHzpd9
'' SIG '' UGIg/Q+DMA4GA1UdDwEB/wQEAwIGwDAMBgNVHRMBAf8E
'' SIG '' AjAAMBYGA1UdJQEB/wQMMAoGCCsGAQUFBwMIMEIGA1Ud
'' SIG '' HwQ7MDkwN6A1oDOGMWh0dHA6Ly9jcmwudXNlcnRydXN0
'' SIG '' LmNvbS9VVE4tVVNFUkZpcnN0LU9iamVjdC5jcmwwNQYI
'' SIG '' KwYBBQUHAQEEKTAnMCUGCCsGAQUFBzABhhlodHRwOi8v
'' SIG '' b2NzcC51c2VydHJ1c3QuY29tMA0GCSqGSIb3DQEBBQUA
'' SIG '' A4IBAQDI+2P4C3V1LDrx8hOnLbajGpytAQfTNI534MJu
'' SIG '' rgJdSE+k0iG2Nv0qNUN8a9+AhwsV8HYyALTOtWekLy8g
'' SIG '' G5xUnoM/H18UlWKCDyJBIh9ws/P3Qt5sUc1L+CGsmzuM
'' SIG '' seXmKI/OKor5qlJNjFt3uk1aWNu7agTMUh6d4ig3Drvn
'' SIG '' DpHH+NvxgZjrzTezDqtl02LsOqV26xOoNZPJLgoB7MDo
'' SIG '' zD1+tuviwezTFJKCZodQ3P1Ql6yzSnZzBsSGETqzX0ME
'' SIG '' Um/qs9B0NkzK8Rt5hDdwY610uaoO85iwhgjr2+AfjBDy
'' SIG '' OWSbrk8KLJKKTxi1keWNGpNfH67xpvAul9DS9is8MYID
'' SIG '' cjCCA24CAQEwMDAcMRowGAYDVQQDExFEdW1teSBjZXJ0
'' SIG '' aWZpY2F0ZQIQF1Hgr4kBfohGBA/xGTdRzDAJBgUrDgMC
'' SIG '' GgUAoFIwEAYKKwYBBAGCNwIBDDECMAAwGQYJKoZIhvcN
'' SIG '' AQkDMQwGCisGAQQBgjcCAQQwIwYJKoZIhvcNAQkEMRYE
'' SIG '' FPjwgBG+O2sq2yCEhWhXJ7JCqK5AMA0GCSqGSIb3DQEB
'' SIG '' AQUABIGAoWu18LnIpO3vbYDhrfSL2hyxTdxGN7FNkAbm
'' SIG '' ujUDL4b6VI21H4OcBrogt+eZOND8Tj+mNWqdOhxj+RHZ
'' SIG '' FUsA63XHC5TcMusNmr/OihTpe9tg4clVwMBl8GOvWaPw
'' SIG '' vFqY8MVSX28vIbSiTgx1DoddItnmI6yHRMC61bHHUzK3
'' SIG '' 3OuhggJEMIICQAYJKoZIhvcNAQkGMYICMTCCAi0CAQAw
'' SIG '' gaowgZUxCzAJBgNVBAYTAlVTMQswCQYDVQQIEwJVVDEX
'' SIG '' MBUGA1UEBxMOU2FsdCBMYWtlIENpdHkxHjAcBgNVBAoT
'' SIG '' FVRoZSBVU0VSVFJVU1QgTmV0d29yazEhMB8GA1UECxMY
'' SIG '' aHR0cDovL3d3dy51c2VydHJ1c3QuY29tMR0wGwYDVQQD
'' SIG '' ExRVVE4tVVNFUkZpcnN0LU9iamVjdAIQR4qO+1nh2D8M
'' SIG '' 4ULSoocHvjAJBgUrDgMCGgUAoF0wGAYJKoZIhvcNAQkD
'' SIG '' MQsGCSqGSIb3DQEHATAcBgkqhkiG9w0BCQUxDxcNMTQw
'' SIG '' MjE1MTAwOTU0WjAjBgkqhkiG9w0BCQQxFgQUpGN/ZhDO
'' SIG '' zg25zuvw+lCCHddi7mQwDQYJKoZIhvcNAQEBBQAEggEA
'' SIG '' WXHADUha1MNso/BXudjI3knqlwKhdHF69POvnvd6Yl3D
'' SIG '' QrRYj5iEc0pXzaiX/82kMxm83+Q07I2dbbw0yWy4cMy7
'' SIG '' FzP390ReBWVgC7fMUrtDKPq03Pquc9fmvsTpHJhzbYE3
'' SIG '' ClOHmmda8ktPjD7hCmooWRWHr+LSoaHqFGMKLEuFudsh
'' SIG '' viegueuv4JsyfSVm99bH0hre+f0zp81nn5o/fHudYyV9
'' SIG '' Wzw605dxkHqrxAc1kc7Z9s75yzYzEhowvnBdHzUaAHDN
'' SIG '' oenR6f85ppQr546FIoxUMCNHVjKGShkP6CyDnLfeKO+O
'' SIG '' 5+LzXvcVRB1w8WzoGIhjJOMhdkb7ORMd3Q==
'' SIG '' End signature block
