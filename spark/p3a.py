import csv
datosStudents = sc.textFile("/home/leo/Files/studentsPR.csv")
students=datosStudents.map(lambda x: [x]).map(lambda x : list(csv.reader(x))[0])
final=students.filter(lambda x: x[5] == 'F').filter(lambda x: x[2] == '71381')
final.foreach(print)
