Attribute VB_Name = "M�dulo1"
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
    Dim variable, variable2 As Integergit add
    Dim MatrizCon As Integer
    ' VARIABLE DE GUARDADO
    Dim inc, cDato, nDato As String
    Dim contador, f2 As Long
    
   
    
    
'INICIALIZAR ORDEN
    fila = 694
    fila2 = 693
    iniciar = 0
    llave = 0
    f2 = 12355
    ' CICLO ITERATIVO N VECES HASTA QUE LA PILA ESTE VAC�A
    
    Do While Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila, "C").Value <> ""
        dato = Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila, "C").Value
        contador = 4
        variable2 = contador
        llave = 0
        llave2 = 1
        
        long1 = Len(dato)
       For Each hoja In ThisWorkbook.Worksheets
           With hoja.UsedRange
           
           
           If hoja.Name = "BUSQUEDA" Then
           
           Else
                Set busqueda = .Range("M1:M1048576,O1:O1048576").Find(What:=dato, LookAt:=xlWhole)
             
                    If Not busqueda Is Nothing Then
                    Do
                      If llave = 1 Then
                      Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Activate
                    cDato = Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila, variable).Value
                    llave2 = 0
                    llave = 0
                    End If
                    nDato = busqueda.Address
                    If nDato = cDato Then
                    
                    Else
                    
                    long2 = Len(busqueda.Value)
                        If long1 = long2 Then
                        inc = busqueda.AddressLocal
                        f1 = busqueda.Row
                        Application.Workbooks("FUID COMPLETO.xlsm").Worksheets(hoja.Name).Activate
                        Application.Workbooks("FUID COMPLETO.xlsm").Worksheets(hoja.Name).Range(Cells(f1, 1), Cells(f1, 25)).Select
                        Selection.Copy
                        Application.Workbooks("FUID FORMATO TOTAL (1).xlsx").Worksheets("FUID").Activate
                        Application.Workbooks("FUID FORMATO TOTAL (1).xlsx").Worksheets("FUID").Cells(f2, 4).Select
                        ActiveSheet.Paste
                        Application.CutCopyMode = False
                        f2 = f2 + 1
                        Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila2, contador).Value = hoja.Name
                        Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila2, contador).Interior.ColorIndex = 43
                        Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila, contador).Value = inc
                        Application.Workbooks("FUID COMPLETO.xlsm").Worksheets("BUSQUEDA").Cells(fila, contador).Interior.ColorIndex = 40
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
        
        If conntador = 4 Then
            Sheets("Hoja1").Cells(fila, "contador").Value = " N/A"
        End If
               fila = fila + 2
               fila2 = fila2 + 2
               iniciar = 1
        Loop
      
End Sub
