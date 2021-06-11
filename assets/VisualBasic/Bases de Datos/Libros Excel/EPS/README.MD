# CODIGO PARA TRANSPONER DATOS 

```
Private Sub Ejecutar_Click()

Dim Llave, fila, fila2, columna, Rangofila As Integer 'Fila es variable para la base de datos , Fila2 es variable para fial en Plantilla final
Dim hoja As Worksheet
Dim variable As String

Llave = 1
fila = 8 ' VARIABLE DE CONTEO
fila2 = 3 'CONSTANTE PARAMETRO TABLA FINAL DE TRASPASO
columna = 1
'Abrir archivo '
Dim MiArchivo As String
MiArchivo = Application.GetOpenFilename(FileFilter:="Archivos de Excel (*.xlsx),*.xlsx", Title:="Por favor, Seleccione un archivo")
If MiArchivo <> "" Then
 Workbooks.Open MiArchivo
 End If
 
    
    For Each hoja In Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets
    'INICIALIZAMOS CONTADOR DE RANGO DE FILAS DE CADA HOJA
                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                Rangofila = 7
                
                    With hoja.UsedRange
                            variable = hoja.Name
                            Do While Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Cells(fila, "B").Value <> ""
                            Rangofila = Rangofila + 1
                            fila = fila + 1
                            Loop
                'Inicializamos Varialbes de posicion

                fila = 8
                columna = 1
    
                If hoja.Name = "JULIO" Or hoja.Name = "AGOSTO" Or hoja.Name = "SEPTIEMBRE" Or hoja.Name = "OCTUBRE" Or hoja.Name = "NOVIEMBRE" Or hoja.Name = "DICIEMBRE" Then
                If hoja.Name = "JULIO" Then
                fila2 = 3
                End If
                'condicion para saltar hojas vacias

                If IsEmpty(Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range("A8")) Then
                GoTo SaltarHoja
                Else
                '********************************************************************************************************
                 'SEGUNDO SEMESTRE DEL AÑO (2021)***********************************************************
                 '*********************************************************************************************************
                 'HASTA QUE LA COLUMNA ESTE VACIA
                    

                                        Do While Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Cells(7, columna).Value <> ""
                                        
                                                             'Columna nombres
                                                             
                                                            If columna = 1 Then
                                                                variable = "A" & fila & ":" & "A" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                     
                                                               
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "A").PasteSpecial xlPasteValues
                                                                Application.CutCopyMode = False
                                                            End If 'End IF columna Nombres
                                                            
                                                            'Columna Documento
                                                              If columna = 2 Then
                                                               variable = "B" & fila & ":" & "B" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "B").PasteSpecial xlPasteValues
                                                                Selection.PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                                
                                                            End If 'End IF columna Documento

                                                            
                                                            'Columna Fecha y Hora ingreso
                                                            If columna = 5 Then
                                                            
                                                                variable = "E" & fila & ":" & "E" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "E").PasteSpecial xlPasteValues
                                                               
                                                                Application.CutCopyMode = False
                                                            End If 'End IF columna Fecha Y Hora de ingreso
                                                            
                                                             'Columnda Remitido
                                                            If columna = 6 Then
                                                            
                                                                variable = "F" & fila & ":" & "F" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "U").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF REMITIDO
                                                            'COLUMNA CX HEMODINAMIA
                                                             If columna = 7 Then
                                                            
                                                                variable = "G" & fila & ":" & "G" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "Y").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF CX HEMODINAMIA
                                                            'HOSPITALIZACION
                                                             If columna = 8 Then
                                                            
                                                                variable = "H" & fila & ":" & "H" & Rangofila
                                                               Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "V").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF CX HEMODINAMIA

                                                                'HOSPITALIZACION
                                                             If columna = 9 Then
                                                            
                                                                variable = "I" & fila & ":" & "I" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "X").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF CX HEMODINAMIA


                                                            'Columnda Fecha y Hora SALIDA
                                                            If columna = 10 Then
                                                            
                                                                variable = "J" & fila & ":" & "J" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "F").PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Fecha y Hora SALIDA
                                                            
                                                             If columna = 11 Then
                                                            
                                                                variable = "K" & fila & ":" & "K" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "AE").PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Fecha y Hora SALIDA

                                                             'Columnda Remision Egreso
                                                            If columna = 13 Then
                                                                variable = "M" & fila & ":" & "M" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021.xlsx").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "AF").PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Remision Egreso
                                                            
                                                             'Columnda Casa
                                                            If columna = 14 Then
                                                                variable = "N" & fila & ":" & "N" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "AD").PasteSpecial xlPasteValues
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Casa
                                                            
                                                            
                                                            'Columnda Morgue
                                                            If columna = 15 Then
                                                                variable = "O" & fila & ":" & "O" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "AH").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Morgue

                                                            'Aseguradora
                                                                If columna = 17 Then
                                                                variable = "Q" & fila & ":" & "Q" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "S").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Aseguradora
                                                            'Columnda REGIMEN
                                                             If columna = 18 Then
                                                                variable = "R" & fila & ":" & "R" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "T").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF REGIMEN

                                                            'Columnda Diagnostico
                                                            
                                                             If columna = 19 Then
                                                                variable = "S" & fila & ":" & "S" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "AB").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Días de estancia
                                                            
                                                              'Columnda Reingreso
                                                             If columna = 22 Then
                                                                variable = "V" & fila & ":" & "V" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("II semestre 2021").Cells(fila2, "AA").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Reingreso
                                                            
                                            
                                            columna = columna + 1
                                            
                                        Loop ' LOOP DE LAS COLUMNAS
                End If
                
                
                
                                
                '********************************************************************************************************
                 'PRIMER SEMESTRE DEL AÑO (2021)***********************************************************
                 '*********************************************************************************************************
                Else
                If IsEmpty(Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range("A8")) Then
                GoTo SaltarHoja
                Else
                
                '   HASTA QUE LA COLUMNA ESTE VACIA
                                        Do While Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Cells(7, columna).Value <> ""
                                        
                                                             'Columna nombres
                                                             
                                                            If columna = 1 Then
                                                                variable = "A" & fila & ":" & "A" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                     
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "A").PasteSpecial xlPasteValues
                                                                Application.CutCopyMode = False
                                                            End If 'End IF columna Nombres
                                                            
                                                            'Columna Documento
                                                              If columna = 2 Then
                                                               variable = "B" & fila & ":" & "B" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "B").PasteSpecial xlPasteValues
                                                                Selection.PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                                
                                                            End If 'End IF columna Documento

                                                            
                                                            'Columna Fecha y Hora ingreso
                                                            If columna = 5 Then
                                                            
                                                                variable = "E" & fila & ":" & "E" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "E").PasteSpecial xlPasteValues
                                                               
                                                                Application.CutCopyMode = False
                                                            End If 'End IF columna Fecha Y Hora de ingreso
                                                            
                                                             'Columnda Remitido
                                                            If columna = 6 Then
                                                            
                                                                variable = "F" & fila & ":" & "F" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "U").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF REMITIDO
                                                            'COLUMNA CX HEMODINAMIA
                                                             If columna = 7 Then
                                                            
                                                                variable = "G" & fila & ":" & "G" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "Y").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF CX HEMODINAMIA
                                                            'HOSPITALIZACION
                                                             If columna = 8 Then
                                                            
                                                                variable = "H" & fila & ":" & "H" & Rangofila
                                                               Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "V").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF CX HEMODINAMIA

                                                                'HOSPITALIZACION
                                                             If columna = 9 Then
                                                            
                                                                variable = "I" & fila & ":" & "I" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "X").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF CX HEMODINAMIA


                                                            'Columnda Fecha y Hora SALIDA
                                                            If columna = 10 Then
                                                            
                                                                variable = "J" & fila & ":" & "J" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "F").PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Fecha y Hora SALIDA
                                                            
                                                             If columna = 11 Then
                                                            
                                                                variable = "K" & fila & ":" & "K" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021.xlsx").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "AE").PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Fecha y Hora SALIDA

                                                             'Columnda Remision Egreso
                                                            If columna = 13 Then
                                                                variable = "M" & fila & ":" & "M" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021.xlsx").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "AF").PasteSpecial xlPasteValues
                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Remision Egreso
                                                            
                                                             'Columnda Casa
                                                            If columna = 14 Then
                                                                variable = "N" & fila & ":" & "N" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "AD").PasteSpecial xlPasteValues
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Casa
                                                            
                                                            
                                                            'Columnda Morgue
                                                            If columna = 15 Then
                                                                variable = "O" & fila & ":" & "O" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "AH").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Morgue

                                                            'Aseguradora
                                                                If columna = 17 Then
                                                                variable = "Q" & fila & ":" & "Q" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021.xlsm").Worksheets("I semestre 2021").Cells(fila2, "S").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Aseguradora
                                                            'Columnda REGIMEN
                                                             If columna = 18 Then
                                                                variable = "R" & fila & ":" & "R" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "T").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF REGIMEN

                                                            'Columnda Diagnostico
                                                            
                                                             If columna = 19 Then
                                                                variable = "S" & fila & ":" & "S" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "AB").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Días de estancia
                                                            
                                                              'Columnda Reingreso
                                                             If columna = 22 Then
                                                                variable = "V" & fila & ":" & "V" & Rangofila
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Activate
                                                                Application.Workbooks("ESTANCIA DIARIA UCI PEDIATRIA  2021").Worksheets(hoja.Name).Range(variable).Select
                                                                Selection.Copy
                                                                
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Activate
                                                                Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets("I semestre 2021").Cells(fila2, "AA").PasteSpecial xlPasteValues

                                                                
                                                                Application.CutCopyMode = False
                                                            End If 'End IF Reingreso
                                                            
                                            
                                            columna = columna + 1
                                            
                                        Loop ' LOOP DE LAS COLUMNAS
                
                End If
                 
                
                End If ' END IF DE CONDICION DE SEMESTRE
                

                            End With 'FINALIZA OBJETO HOJA
                            
SaltarHoja: 'Desde goto
            Rangofila = Rangofila - 7
            fila2 = fila2 + Rangofila
                
    Next 'Siguiente hoja
   
   
   'CALCULO DE TIEMPO ENTRE INGRESO Y EGRESO
  
   Dim FI, FF As Date
    Dim D, H, M, S As Double
    Dim RestaDeFechas, variable2  As String
    
   For Each hoja In Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets
   With hoja.UsedRange
   fila2 = 3
   variable = "E" & fila2 & ":" & "E" & fila2
   Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Activate
   variable2 = Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Range(variable).Value
   
   Do While Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 5).Value <> ""
    FI = Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 5).Value
    FF = Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 6).Value
    
    
        If IsEmpty(Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 6).Value) Then
            
            'Valor de Hoy casilla B1
                    FF = Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(1, 2).Value
                    S = DateDiff("s", FI, FF)
                    If S / 86400 >= 1 Then: D = Fix(S / 86400): S = S - 86400 * D: Else D = 0
                    If S / 3600 >= 1 Then: H = Fix(S / 3600): S = S - 3600 * H: Else H = 0
                    If S / 60 >= 1 Then: M = Fix(S / 60): S = S - 60 * M: Else M = 0
            ' RestaDeFechas = D & " Dia(s) " & H & " Hora(s) " & M & " Minuto(s) " & S & " Segundo(s)"
                    
                    RestaDeFechas = D & " Dia(s) " & H & " Hora(s) "
                    
                    Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 11).Value = RestaDeFechas
                    '4326060
            Else
                            S = DateDiff("s", FI, FF)
                            If S / 86400 >= 1 Then: D = Fix(S / 86400): S = S - 86400 * D: Else D = 0
                            If S / 3600 >= 1 Then: H = Fix(S / 3600): S = S - 3600 * H: Else H = 0
                            If S / 60 >= 1 Then: M = Fix(S / 60): S = S - 60 * M: Else M = 0
    
                        RestaDeFechas = D & " Dia(s) " & H & " Hora(s) "
                        
                        Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 11).Value = RestaDeFechas
    
        End If
    
    
    fila2 = fila2 + 1
    Loop 'Loop  de filas de horas entrada COLUMNA E
    
    fila2 = 3 'Iniciamos  fila, para fecha ingreso 1/2
    
    Do While Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 1).Value <> ""
    variable = "H" & fila2 & ":" & "H" & fila2
    FI = Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 8).Value
    FF = Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 9).Value
    
    If IsEmpty(Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Range(variable).Value) Then
            
                    RestaDeFechas = "Ingrese las fechas inicial y final"
                    Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 10).Value = RestaDeFechas
            Else
                            S = DateDiff("s", FI, FF)
                            If S / 86400 >= 1 Then: D = Fix(S / 86400): S = S - 86400 * D: Else D = 0
                            If S / 3600 >= 1 Then: H = Fix(S / 3600): S = S - 3600 * H: Else H = 0
                            If S / 60 >= 1 Then: M = Fix(S / 60): S = S - 60 * M: Else M = 0
    
                        RestaDeFechas = D & " Dia(s) " & H & " Hora(s) "
                        
                        Application.Workbooks("Formato AUTO-BasedatosUCIP2021").Worksheets(hoja.Name).Cells(fila2, 10).Value = RestaDeFechas
    
        End If
    
    
    
    D = 0
    M = 0
    S = 0
    fila2 = fila2 + 1
    
            Loop ' LOOP HORAS COLUMNA H
            
           End With
           
        Next 'Next hojas
        
End Sub
```
> _Sistemas de calculo en fecha en inicio y fianl_







```
## Diseño de Funcion Calculo Edad
Function CalculoEdad(FI As Date, FF As Date, Value As String) As String

Dim A, Mes, S, Dia As Double
Dim Llave As String

S = DateDiff("m", FI, FF) 'Devuelve
            If S >= 12 Then
              Llave = "A"
              ElseIf S < 12 & S > 0 Then
              Llave = "M"
              Else
              S = 0
              Llave = "D"
              End If

    If Value = Llave Then
    
                If Llave = "A" Then
                        A = DateDiff("yyyy", FI, FF)
                        CalculoEdad = A & " Año(s) "
                ElseIf Llave = "M" Then
                    Mes = DateDiff("m", FI, FF)
                   CalculoEdad = Mes & " Mes(es) "
                ElseIf Llave = "D" Then
                   Dia = DateDiff("d", FI, FF)
                   CalculoEdad = Dia & " Dia(s) "
                End If
                
    
    
    Else
    
    CalculoEdad = "-"
    
    End If

End Function
```
