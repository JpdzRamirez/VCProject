# Codigo

```
Attribute VB_Name = "Modulo1"
 '          .'  '.
 '                _.-'/  |  \
  '  ,        _.-"  ,|  /  0 `-.
   ' |\    .-"       `--""-.__.'=====================-,
    '\ '-'`        .___.--._)=========================|
     '\            .'      |                          |
      '|     /,_.-'        |        ELABORADO POR:    |
    '_/   _.'(             |                          |
   '/  ,-' \  \            |     JEREMY IVAN PEDRAZA  |
   '\  \    `-'            |                          |
   ' `-'                   '--------------------------'

Public Sub MostrarHojaBienOcultas()
Application.Workbooks("FORMATO REGULACION.xlsm").Worksheets("CONFIGURACION").Visible = True
End Sub

Private Sub AGREGAR_Click()
    Dim fila, variable, contador, llave As Integer
        fila = 6
        llave = 1
        variable = Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 1").Cells(fila, "A").Value
        For contador = 6 To 47
            If variable = "" Then
                If llave = 1 Then
                '1////////////////////////////////////////////////////'
                 Application.ActiveWorkbook.Worksheets("LISTADO DE OCUPACIONES").Activate
                 Application.ActiveWorkbook.Worksheets("LISTADO DE OCUPACIONES").Cells(5, "B").Select
                 Selection.Copy
                 Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 1").Activate
                 Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 1").Cells(fila, "B").Select
                ' ActiveSheet.Paste'
                 Selection.PasteSpecial Paste:=xlPasteValues
                 Application.CutCopyMode = False
                 '2/////////////////////////////////////////////////////'
                 'Application.Workbooks("FORMATO REGULACION.xlsm").Worksheets("LISTADO DE OCUPACIONES").Activate
                 Application.ActiveWorkbook.Worksheets("LISTADO DE OCUPACIONES").Activate
                 Application.ActiveWorkbook.Worksheets("LISTADO DE OCUPACIONES").Cells(5, "C").Select
                 Selection.Copy
                 Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 1").Activate
                 Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 1").Cells(fila, "A").Select
                 Selection.PasteSpecial Paste:=xlPasteValues
                 Application.CutCopyMode = False
                 llave = 0
                 Application.ActiveWorkbook.Worksheets("LISTADO DE OCUPACIONES").Activate
                 End If
             End If
             fila = fila + 1
             variable = Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 1").Cells(fila, "A").Value
        Next
    
End Sub
Private Sub LimpiarHoja2_Click()
    Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 2").Range("B5:D28").Value = Null
    Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 2").Range("F5:G28").Value = Null
    Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 2").Range("I5:J28").Value = Null
    Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 2").Range("L5:M28").Value = Null
    Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 2").Range("O5:P28").Value = Null
    Application.ActiveWorkbook.Worksheets("FORMATO DE MATRIZ 2").Range("R5:S28").Value = Null
End Sub

Private Sub BUSCADOR_Change()
Cells(5, "B") = BUSCADOR.Value

End Sub
```
