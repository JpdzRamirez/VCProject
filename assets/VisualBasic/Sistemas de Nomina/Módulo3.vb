Attribute VB_Name = "Módulo3"

Public Sub CalcularNomina()
Attribute CalcularNomina.VB_ProcData.VB_Invoke_Func = "L\n14"
    Dim fila As Byte
    Dim pivote, pivote2 As Byte
    Dim valido, llave As Boolean
    Dim variable, variable2 As Long
    'CONFIRGURACION DE FILA INICIAL Y PIVOTE

     fila = 3
     pivote2 = 2
     'CICLO HASTA DONDE NO HAYA DATOS
Do While Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "B").Value <> ""
'COLOCAR EL SUELDO SEGUN EL CODIGO Y SI ES VIGENTE EL CONTRATO
  pivote = 3
  valido = False
  llave = False
If Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "F").Value = "VIGENTE" Then
  Do While Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(pivote, "W").Value <> "" Or llave = False
  If Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "B").Value = _
     Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(pivote, "W").Value Then
     
     variable = (Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "P").Value + Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "O").Value)
     variable2 = Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(pivote, "X").Value
          Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "I").Value = variable
          valido = True
          llave = True
          'VERIFICAR SI SUPERA DOS MINIMOS PARA AUX DE TRANSP
 If variable2 > Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(4, "X").Value Then
   Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "M").Value = "NO APTO"
   'CASO DONDE ES APTO PARA AUXILIO DE TRANSPORTE
   Else
   variable = (Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("Datos").Cells(pivote2, "M").Value) - (Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("Datos").Cells(pivote2, "N").Value)
   Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "M").Value = (6.125 * variable)
 End If

  End If
  pivote = pivote + 1
  Loop
     If valido = False Then
 MsgBox "Codigo de sueldo no valido"
 Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "I").Value = 0
 Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Range(Cells(fila, "B"), Cells(fila, "T")).Interior.ColorIndex = 3
 ElseIf valido = True Then
 Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Range(Cells(fila, "B"), Cells(fila, "T")).Interior.ColorIndex = 0
     End If
  
 'CASO DONDE NO ESTA VIGENTE EL CONTRATO
Else
Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "H").Value = 0
Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("SUELDOS").Cells(fila, "L").Value = 0
End If

    'MOVERNOS DE FILA
    fila = fila + 1
    pivote2 = pivote2 + 1
    'RESTAURAR EL PIVOTE DE CODIGOS DE SUELDOS

        Loop
        
End Sub

