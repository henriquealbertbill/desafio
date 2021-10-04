#language: pt

Funcionalidade: Passar no desafio da accenture
	Eu como futuro colaborador da empresa
	Desejo fazer um desafio em selenium seguindo as regras
	Para poder ingressa na empresa
	
Cenario: Efetuar cotacao de seguro apenas com os campos obrigatorios
	Dado que estou no site "http://sampleapp.tricentis.com/101/app.php"
	E que preenchi os campos Make, Engine Performance, Data Of manufacture, Number of Seats, Fuel Type, List Price e Annual Mileage da aba Enter Vehicle Data com seus respectivos valores "Audi", "200", "09/13/2021", "2", "Gas", "500" e "100"
	E que preenchi os campos First Name, Last Name, Date of Birth, Country, Zip Code, Occupation e Hobbies da aba Enter Insurant Data com seus respectivos valores "Henrique", "Loyola", "11/14/1996", "Brazil", "35010040" e "Farmer"
	E que preenchi os campos Start Date, Insurance Sum, Marit Rating, Damage Insurance, Optional Products e Courtesy Car da aba Enter Product Data com seus respectivos valores "11/25/2021", "3.000.000,00", "Bonus 1", "No Coverage" e "Yes"
	E que selecionei o plano "Silver" na aba Select Price Option
	E que preenchi os campos E-mail, Username, Password e Confirm Password da aba Send Quote com seus respctivos valores "teste@teste.com", "teste", "Teste123" e "Teste123"
	Quando eu clicar no botao Send
	Entao eu vejo o modal de sucesso com a menssagem "Sending e-mail success!"