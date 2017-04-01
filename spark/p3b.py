import csv
datosEscuelas = sc.textFile("/home/leo/Files/escuelasPR.csv")
escuelas=datosEscuelas.map(lambda x: [x]).map(lambda x : list(csv.reader(x))[0])
escuelasPonce = escuelas.filter(lambda x: x[2] == 'Ponce')
escuelasCaboRojo = escuelas.filter(lambda x: x[2] == 'Cabo Rojo')
escuelasDorado = escuelas.filter(lambda x: x[2] == 'Dorado')
final2 = escuelasPonce.union(escuelasCaboRojo).union(escuelasDorado)
final2.foreach(print)

