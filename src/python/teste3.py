from structures import Table,TableOperator
from enums import Order, Type
from instructions import read_str, read_int, read_real


alunos = Table("alunos")
alunos.add_col({ "Nome": Type.STRING })
alunos.add_col({ "NMEC": Type.INT })
alunos.add_col({ "Mail": Type.STRING })
notas = Table("notas")
notas.add_col({ "NMEC": Type.INT })
notas.add_col({ "Nota1": Type.FLOAT })
notas.add_col({ "Nota2": Type.FLOAT })
notas.add_col({ "NotaF": lambda temp1: (temp1.value("Nota1") + temp1.value("Nota2")) / 2 })
while (True): 
	print("Escolhe uma opção: ")
	print("1. Adicionar Aluno")
	print("2. Adicionar Nota")
	print("3. Ver Notas")
	print("4. Draft Final")
	print("5. Sair")
	opcao = read_int()
	if (opcao == 1): 
		print("Nome:")
		nome = read_str()
		print("NMEC:")
		nmec = read_int()
		print("Mail:")
		mail = read_str()
		alunos.add((nome, nmec, mail))
		notas.add({ "NMEC": nmec })

	elif (opcao == 2): 
		print("NMEC")
		nmec = read_int()
		print("Nota1")
		nota1 = read_real()
		print("Nota2")
		nota2 = read_real()
		notas.select(lambda temp1: temp1.value("NMEC") == nmec).alter({ "Nota1": nota1, "Nota2": nota2 })

	elif (opcao == 3): 
		print(notas)

	elif (opcap == 4): 
		print((notas * alunos))

	elif (opcao == 5): 
		break

	else: 
		print("Mete uma opçao de jeito")





