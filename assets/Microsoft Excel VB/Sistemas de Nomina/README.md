# Codigo

## Modulo 1

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

Attribute VB_Name = "Modulo1"
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
```

## Modulo 2

```
Attribute VB_Name = "M�dulo2"
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
```

## Modulo 3

```

Attribute VB_Name = "M�dulo3"

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

```

##  Modulo 4

 ```
 Attribute VB_Name = "M�dulo4"
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
```
