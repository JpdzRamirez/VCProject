Attribute VB_Name = "Módulo1"
Public Sub MacroTotales()
Attribute MacroTotales.VB_Description = "Macro para Hallar el total del gasto en sueldo\nRepetidor de acuerdo al numero de empleados, puede amuentar los items en los empleados sin ningun problema"
Attribute MacroTotales.VB_ProcData.VB_Invoke_Func = "W\n14"
    Dim fila As Byte
    Dim total As Long
    Dim pivote As Byte
    Dim pivote2 As Byte

    pivote2 = 17
    fila = 2

    total = 0
    
    Do While Sheets("EJERCICIO").Cells(fila, "A").Value <> ""
        pivote = Sheets("EJERCICIO").Cells(fila, "G").Value
        If pivote = 1 Then
        total = total + Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(pivote2, "B").Value
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(fila, "K").Value = _
        ((Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(pivote2, "B").Value) - (Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(fila, "J").Value))
        ElseIf pivote = 2 Then
        total = total + Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(pivote2 + 1, "B").Value
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(fila, "K").Value = _
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(pivote2 + 1, "B").Value - _
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(fila, "J").Value
        ElseIf pivote = 3 Then
        total = total + Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(pivote2 + 2, "B").Value
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(fila, "K").Value = _
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(pivote2 + 2, "B").Value - _
        Application.Workbooks("TABLA COMPLETA GENERAL").Worksheets("EJERCICIO").Cells(fila, "J").Value
        End If
        fila = fila + 1
        pivote2 = 17
        
        Loop
        Sheets("EJERCICIO").Cells(17, "E") = total
    

End Sub

