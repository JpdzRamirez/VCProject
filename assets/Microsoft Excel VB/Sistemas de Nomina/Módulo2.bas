Attribute VB_Name = "Módulo2"
Public Sub MacroNotas()
Attribute MacroNotas.VB_ProcData.VB_Invoke_Func = "U\n14"
    Dim fila As Byte
    Dim pivote As Byte
    Dim ponderado
    Dim columnap
    Dim columnae
    Dim i As Integer
    
     ponderado = 0
     fila = 3
    Do While Sheets("BECAS").Cells(fila, "A").Value <> ""
    columnap = 3
    columnae = 4
        For i = 1 To 3
        pivote = Sheets("BECAS").Cells(fila, columnap).Value
        If pivote < 75 Then
        Sheets("BECAS").Cells(fila, columnae).Value = "NO APROBADO"
        Sheets("BECAS").Cells(fila, columnae).Interior.ColorIndex = 3
        Else
        Sheets("BECAS").Cells(fila, columnae).Value = "APROBADO"
        Sheets("BECAS").Cells(fila, columnae).Interior.ColorIndex = 4
        End If
    ponderado = ponderado + pivote
        If i = 3 Then
    ponderado = ponderado / i
        End If
    columnap = columnap + 2
    columnae = columnae + 2
        Next i
         Sheets("BECAS").Cells(fila, "I") = ponderado
         If ponderado >= 90 Then
         Sheets("BECAS").Cells(fila, "J") = 1
         ElseIf ponderado >= 85 And ponderado < 90 Then
         Sheets("BECAS").Cells(fila, "J") = 0.75
         ElseIf ponderado >= 80 And ponderado < 85 Then
         Sheets("BECAS").Cells(fila, "J") = 0.5
         Else
         Sheets("BECAS").Cells(fila, "J") = "NO BECA"
         End If
         
    columna = 3
    ponderado = 0
    fila = fila + 1
        Loop
        
    

End Sub
