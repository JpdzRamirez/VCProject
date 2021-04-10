Attribute VB_Name = "Módulo1"
Private Sub Generar_Click()
'Generar una factura nueva'
Dim variable, fila, columna, contador, contadorfa, contadorform As Integer
'HOJA COTIZACION
contadorfa = Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "X").Value
contador = Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "X").Value
Application.ActiveWorkbook.Worksheets("Cotizacion").Activate
variable = Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(12, "X").Value
variable = variable + 1
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(12, "X").Value = variable
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(14, "J").Select
Selection.Copy
'HOJA VENTAS
            Application.ActiveWorkbook.Worksheets("VENTAS").Activate
            Application.ActiveWorkbook.Worksheets("VENTAS").Cells(contador, "D").Select
            Selection.PasteSpecial xlPasteValues
'HOJA COTIZACION
        Application.ActiveWorkbook.Worksheets("Cotizacion").Activate
        Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(12, "J").Select
        Selection.Copy
        Application.ActiveWorkbook.Worksheets("VENTAS").Activate
        Application.ActiveWorkbook.Worksheets("VENTAS").Cells(contador, "A").Select
        Selection.PasteSpecial xlPasteValues
'HOJA VENTAS
    Application.ActiveWorkbook.Worksheets("VENTAS").Activate
    
    
    'HOJA COTIZACIÓN
                        Application.ActiveWorkbook.Worksheets("Cotizacion").Activate
                        Application.ActiveWorkbook.Worksheets("Cotizacion").Range("B21:L32").Select
                        Selection.Copy
                  'HOJA VENTAS
                        Application.ActiveWorkbook.Worksheets("VENTAS").Activate
                        Application.ActiveWorkbook.Worksheets("VENTAS").Cells(contador, "G").Select
                        Selection.PasteSpecial xlPasteValues
                        Selection.PasteSpecial xlPasteFormats
                        Application.CutCopyMode = False
                        
    contador = contador + 12
    contadorfa = contador / 13
    Application.ActiveWorkbook.Worksheets("VENTAS").Activate
    Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "X").Value = contador
    Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "U").Value = contadorfa
Application.ActiveWorkbook.Worksheets("Cotizacion").Activate
Application.ActiveWorkbook.Save

End Sub


Private Sub LIMPIAR_Click()
'Limpiar Hoja de remisión'
Application.ActiveWorkbook.Worksheets("Cotizacion").Activate
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(8, "M").Select
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(8, "C").Value = Null
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(10, "C").Value = Null
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(12, "C").Value = Null
Application.ActiveWorkbook.Worksheets("Cotizacion").Range("B21:I28").Value = Null

End Sub

Private Sub RESET_Click()
'SE RESETEA CONTADORES Y HOJAS CON FORMATOS'
Dim var As Integer
var = Application.ActiveWorkbook.Worksheets("Ventas").Cells(6, "X").Value
'LIMPIAMOS FORMATO Y CELDAS

Application.ActiveWorkbook.Worksheets("Cotizacion").Activate
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(12, "X").Select
Application.ActiveWorkbook.Worksheets("Cotizacion").Cells(12, "X").Value = 0
Application.ActiveWorkbook.Worksheets("VENTAS").Activate
Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "X").Select
Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "X").Value = 7
Application.ActiveWorkbook.Worksheets("VENTAS").Cells(6, "U").Value = 0
Application.ActiveWorkbook.Worksheets("VENTAS").Activate
Application.ActiveWorkbook.Worksheets("VENTAS").Range("A7:Q1000").Select
Selection.Clear

'FORMATO Y ESTILO DE RANGOS'
Application.ActiveWorkbook.Worksheets("VENTAS").Range("A7:A1000").Select
Selection.NumberFormat = "00000"
 With Selection.Font

        .Name = "Arial Black"

        .Size = 14

        .Strikethrough = False

        .Superscript = False

        .Subscript = False

        .OutlineFont = False

        .Shadow = False

        .Underline = xlUnderlineStyleNone

        .Color = vbBlack
        
        .Bold = True

        .TintAndShade = 0

        .ThemeFont = xlThemeFontNone

    End With
    
    'FORMATO Y ESTILO DE RANGOS'
Application.ActiveWorkbook.Worksheets("VENTAS").Range("D7:Q1000").Select
Selection.NumberFormat = "d/mm/yyyy"
 With Selection.Font

        .Name = "Arial Black"

        .Size = 14

        .Strikethrough = False

        .Superscript = False

        .Subscript = False

        .OutlineFont = False

        .Shadow = False

        .Underline = xlUnderlineStyleNone

        .Color = vbBlack
        
        .Bold = True
        
        .TintAndShade = 0

        .ThemeFont = xlThemeFontNone

    End With
Application.ActiveWorkbook.Worksheets("Cotizacion").Activate

End Sub
