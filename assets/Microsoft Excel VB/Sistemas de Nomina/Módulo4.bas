Attribute VB_Name = "Módulo4"
Sub Horas()
Attribute Horas.VB_Description = "Macro Para Calcular las horas trabajadas."
Attribute Horas.VB_ProcData.VB_Invoke_Func = "j\n14"

'Contadores de horas
Dim contadorDia, contadorNoche, contadorNoEx, contadorDiEx, contadorFestDom, contadorFestDomEx, contadorFestDomNo, condarorFestDomNoEx As Integer
'Variables de posicion

Dim FestivoDomingo As Boolean
Dim variable, variable2 As Date
Dim llave, posicion, privote, variable3, variable4 As Byte
Dim fila, DiaValor As Integer

'Inicializar variables
fila = 3
variable4 = Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(1, "B").Value
Do While Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "A").Value <> ""
     'INICIALIZAR VARIABLES DE CONTEO PARA CADA CASO
      contadorDia = 0
      contadorNoche = 0
      contadorNoEx = 0
      contadorDiEx = 0
      contadorFestDom = 0
      contadorFestDomEx = 0
      contadorFestDomNo = 0
      contadorFestDomNoEx = 0
      FestivoDomingo = False
      pivote = 2
      llave = 0
      variable = 0
      variable2 = 0
      '/////////////////////////////////
      'VERIFICAR SI ES DOMINGO O FESTIVO
      variable = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "B").Value)
      DiaValor = Weekday(variable)
      ' 1.  VERIFICAR SI ES FESTIVO
       For variable3 = 3 To 19
               If variable = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(variable3, "S").Value) Then
                variable3 = 19
                FestivoDomingo = True
               End If
       Next variable3
       ' 2. VERIFICAR SI ES DOMINGO
       If DiaValor = 1 Then
       FestivoDomingo = True
       End If
      'ELEGIR CASO FESTIVO/DOMINO O DIA CORRIENTE
  Select Case FestivoDomingo
  'CASO SI ES FESTIVO O DOMINGO /////////////////////////////////////////
  Case Is = True
  
      
  'ELEJIMOS HORA DE ENTRADA DE PERSONAL
  variable = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "C").Value)
  
      'VERIFICAR SI LAS HORAS SON EN DIA O NOCHE
Do While llave < 2 ' SOLO SALIMOS CON LLAVE
'MOVEMOS PIVOTE HASTA ENCONTRAR LA ENTRADA
          variable2 = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(pivote, "T"))

           If variable2 = variable Then 'ENTRADA ENCONTRADA
             'DEFINIMOS VARIABLE DE SALIDA
             variable = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "F"))
             
            
             'INICIAMOS CICLO /////////////////////////////////////////
              Do While llave < 2 ' CICLO HASTA CONSEGUIR LA LLAVE Y LA SALIDA
                pivote = pivote + 1
            'DEFINIMOS VARIABLE2 COMO VALOR GUIA SEGUN EL PIVOTE
              variable2 = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(pivote, "T"))
            'CASOS DE CAMBIO DE JORNADA NOCTURNA A DIA O DIA A NOCTURNA
               If pivote = 24 And contadorFestDom < variable4 Then
                If contadorFestDomNo >= 1 Then
                
                contadorFestDom = contadorFestDom + 1
                Else
                contadorFestDom = contadorFestDom + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
                ElseIf pivote = 24 And contadorFestDom >= variable4 Then
                If contadorFestDoNoEx >= 1 Then
                
                contadorFestDomEx = contadorFestDomEx + 1
                Else
                contadorFestDomEx = contadorFestDomEx + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
                ElseIf pivote = 8 And contadorFestDomNo < variable4 Or pivote = 8 And contadorFestDomNo < variable4 Then
                If contadorFestDom >= 1 Then
                
                contadorFestDomNo = contadorFestDomNo + 1
                Else
                contadorFestDomNo = contadorFestDomNo + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
                ElseIf pivote = 8 And contadorFestDomNo >= variable4 Then
                If contadorFestDomEx >= 1 Then
                
                contadorFestDomNoEx = contadorFestDomNoEx + 1
                Else
                contadorFestDomNoEx = contadorFestDomNoEx + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
               Else
                'HORAS NOCTURNAS Y EXTRAS NOCTURNAS
                
                   If (pivote > 24 And pivote <= 27) Or (pivote >= 2 And pivote < 7) Then
                        If contadorFestDomNo < variable4 And contadorFestDom < variable4 And contadorFestDomNo + contadorFestDom < variable4 Then
                       contadorFestDomNo = contadorFestDomNo + 1 'SUMAMOS HORAS NOCTURNAS PARA DIAS FESTIVOS O DOMINGOS
                        ElseIf contadorFestDomNo >= variable4 Or contadorFestDom >= variable4 Or contadorFestDomNo + contadorFestDom >= variable4 Then
                        contadorFestDomNoEx = contadorFestDomNoEx + 1 'SUMAMOS HORAS EXTRAS NOCTURNAS PARA DIAS FESTIVOS O DIMINGOS
                        End If
                    If variable = variable2 Then
                       llave = 3            ' SALIMOS DEL CICLO Y DAMOS
                    End If
                 'HORAS DIURNAS Y EXTRAS DIURNAS
                   ElseIf (pivote >= 8 And pivote < 23) Then
                       If contadorFestDom < variable4 And contadorFestDomNo < variable4 And contadorFestDom + contadorFestDomNo < variable4 Then
                       contadorFestDom = contadorFestDom + 1 'SUMAMOS UNA HORA EN EL CONTADOR DE HORAS DIURNAS PARA FESTIVOS O DOMINGOS
                       ElseIf contadorFestDom >= variable4 Or contadorFestDomNo >= variable4 Or contadorFestDom + contadorFestDomNo >= variable4 Then
                       contadorFestDomEx = contadorFestDomEx + 1 'SUMAMOS UNA HORA EN EL CONTADOR DE HORAS EXTRAS DIURNAS PARA FESTIVOS O DOMINGOS
                       End If
                       If variable = variable2 Then
                       llave = 3
                       End If
               End If

           End If
              
                
               If pivote = 28 Then 'DEVOLVER EL PIVOTE DE TIEMPO AL INICIO
                  pivote = 1
               End If
              Loop
        End If
pivote = pivote + 1
          
Loop
 'CASO SI NO ES FESTIVO NI DOMINGO ///////////////////////////////
  Case Is = False
      
  'ELEJIMOS HORA DE ENTRADA DE PERSONAL
  variable = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "C").Value)
  
      'VERIFICAR SI LAS HORAS SON EN DIA O NOCHE
Do While llave < 2 ' SOLO SALIMOS CON LLAVE
'MOVEMOS PIVOTE HASTA ENCONTRAR LA ENTRADA
          variable2 = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(pivote, "T"))

           If variable2 = variable Then 'ENTRADA ENCONTRADA
             'DEFINIMOS VARIABLE DE SALIDA
             variable = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "F"))
             
            
             'INICIAMOS CICLO /////////////////////////////////////////
              Do While llave < 2 ' CICLO HASTA CONSEGUIR LA LLAVE Y LA SALIDA
                pivote = pivote + 1
                variable3 = 0
            'DEFINIMOS VARIABLE2 COMO VALOR GUIA SEGUN EL PIVOTE
              variable2 = CDate(Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(pivote, "T"))
            'CASOS DE CAMBIO DE JORNADA NOCTURNA A DIA O DIA A NOCTURNA
               If pivote = 24 And contadorDia < variable4 Then
                If contadorNoche >= 1 Then
                
                contadorDia = contadorDia + 1
                Else
                contadorDia = contadorDia + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
                ElseIf pivote = 24 And contadorDia >= variable4 Then
                If contadorNoEx >= 1 Then
                
                contadorDiEx = contadorDiEx + 1
                Else
                contadorDiEx = contadorDiEx + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
                ElseIf pivote = 8 And contadorNoche < variable4 Then
                If contadorDia >= 1 Then
                
                contadorNoche = contadorNoche + 1
                Else
                contadorNoche = contadorNoche + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
                ElseIf pivote = 8 And contadorNoche >= variable4 Then
                If contadorDiEx >= 1 Then
                
                contadorNoEx = contadorNoEx + 1
                Else
                contadorNoEx = contadorNoEx + 1
                End If
                If variable = variable2 Then
                       llave = 3
                       End If
               Else
                'HORAS NOCTURNAS Y EXTRAS NOCTURNAS
                
                   If (pivote > 24 And pivote <= 27) Or (pivote >= 2 And pivote < 7) Then
                        If contadorNoche < variable4 And contadorDia < variable4 And contadorNoche + contadorDia < variable4 Then
                       contadorNoche = contadorNoche + 1 'SUMAMOS HORAS NOCTURNAS PARA DIAS ORDINARIOS
                        ElseIf contadorNoche >= variable4 Or contadorDia >= variable4 Or contadorDia + contadorNoche >= variable4 Then
                        contadorNoEx = contadorNoEx + 1 'SUMAMOS HORAS EXTRAS NOCTURNAS PARA DIAS ORDINARIOS
                        End If
                    If variable = variable2 Then
                       llave = 3            ' SALIMOS DEL CICLO Y DAMOS
                    End If
                 'HORAS DIURNAS Y EXTRAS DIURNAS
                   ElseIf (pivote > 8 And pivote < 23) Then
                       If contadorDia < variable4 And contadorNoche < variable4 And contadorDia + contadorNoche < variable4 Then
                       contadorDia = contadorDia + 1 'SUMAMOS UNA HORA EN EL CONTADOR DE HORAS DIURNAS PARA DIAS ORDINARIOS
                       ElseIf contadorDia >= variable4 Or contadorNoche >= variable4 Or contadorDia + contadorNoche >= variable4 Then
                       contadorDiEx = contadorDiEx + 1 'SUMAMOS UNA HORA EN EL CONTADOR DE HORAS EXTRAS DIURNAS PARA DIAS ORDINARIOS
                       End If
                       If variable = variable2 Then
                       llave = 3
                       End If
               End If

           End If
              
                
               If pivote = 28 Then 'DEVOLVER EL PIVOTE DE TIEMPO AL INICIO
                  pivote = 1
               End If
               
              Loop
        End If
pivote = pivote + 1
          
Loop
  End Select
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "G").Value = contadorDia
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "H").Value = contadorNoche
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "I").Value = contadorDiEx
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "J").Value = contadorNoEx
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "K").Value = contadorFestDom
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "L").Value = contadorFestDomNo
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "M").Value = contadorFestDomEx
  Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "N").Value = contadorFestDomNoEx
'ESCRIBIR LOS RESULTADOS DEL CONTEO EN LAS CELDAS

variable3 = Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "P").Value
If variable3 <> 1 And variable3 < 20 Then
Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "P").Interior.ColorIndex = 3
Else
Application.Workbooks("TABLA COMPLETA GENERAL.2.0").Worksheets("HORAS TRABAJADAS").Cells(fila, "P").Interior.ColorIndex = 24
End If
fila = fila + 1
Loop

End Sub
