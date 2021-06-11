
# Codigo


```
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
´´
Sub BotonBusqueda()
        ' VARIABLES DE BUSQUEDA
    Dim dato As String
    Dim busqueda, f1, c1 As Range
    Dim hoja As Worksheet
    Dim long1, long2, iniciar, llave, llave2 As Integer
    ' VARIABLES DE MOVIMIENTO
    Dim pivote As Integer
    Dim fila As Integer
    Dim fila2 As Integer
    Dim variable, variable2 As Integer
    Dim MatrizCon As Integer
    ' VARIABLE DE GUARDADO
    Dim inc, cDato, nDato, temp, copiaC, copiaR As String
    Dim contador, f2, f3 As Long
'INICIALIZAR ORDEN
    fila = 2
    fila2 = 2
    iniciar = 0
    llave = 0
    f2 = 13
    f3 = 52
    iniciar = 1
    ' CICLO ITERATIVO N VECES HASTA QUE LA PILA ESTE VACÍA
    Do While Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets("Sheet1").Cells(fila, "B").Value <> ""
        dato = Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets("Sheet1").Cells(fila, "B").Value
        contador = 95
        variable2 = contador
        llave = 0
        llave2 = 1
        cDato = ""
        long1 = Len(dato)
       For Each hoja In ThisWorkbook.Worksheets
           With hoja.UsedRange
           If hoja.Name = "Sheet1" Then
           Else
                Set busqueda = .Range("A1:A1048576,A1:A1048576").Find(What:=dato, LookAt:=xlWhole)
                    llave2 = 1
                    If Not busqueda Is Nothing Then
                    Do
                     nDato = busqueda.Address
                      If llave = 1 Then
                      Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets("Sheet1").Activate
                      If iniciar = 1 Then
                    cDato = temp
                    iniciar = 0
                    Else
                    cDato = inc
                    End If
                    llave2 = 0
                    llave = 0
                    End If
                    If nDato = cDato Then
                    Else
                    long2 = Len(busqueda.Value)
                        If long1 = long2 Then
                        inc = busqueda.AddressLocal
                        If iniciar = 1 Then
                        temp = inc
                        End If
                        f1 = busqueda.Row
                        ' COPIA Y PEGADO DE HOJA 1
                            If hoja.Name = "Cruce" Then
                            Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets(hoja.Name).Activate
                            Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets(hoja.Name).Range(Cells(f1, "N"), Cells(f1, "N")).Value = "Si"
                            Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets(hoja.Name).Range(Cells(f1, "N"), Cells(f1, "N")).Interior.ColorIndex = 40
                            Application.Workbooks("ARCHIVO DE BUSQUEDA Empresas Reguladas.xlsm").Worksheets("Sheet1").Cells(fila, "AD").Value = "Si"
                        End If
                        '/// Avance de conteo
                        contador = contador + 1
                            If contador > variable2 And llave2 = 1 Then
                                llave = 1
                                variable = contador - 1
                             End If
                        End If
                        Set busqueda = .FindNext(busqueda)
                    End If
                Loop Until nDato = cDato
                     End If
            End If
            End With
        Next
               fila = fila + 1
               iniciar = 1
        Loop
End Sub
```
