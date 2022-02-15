<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Java - Atualizar Cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="indeex.html">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="CreateAndFind">Lista de Clientes</a>
        </li>
      </ul>
      <form action="CreateAndFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o Nome ou CPF" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Atualizar Passageiro</h3>
			<hr>
			<form action="PassageiroUpdate" method="POST">
					<input value="${passageiro.id}" name="id" type="number" style="visibility:hidden">
					<div class="form-floating mb-3">
						<input value="${passageiro.nome}" name="nome" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Nome completo</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${passageiro.cpf}" name="cpf" maxlength="11" type="text" class="form-control"> 
						<label>CPF (apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${passageiro.idade}" name="idade" type="text" maxlength="2" class="form-control" placeholder="Idade">
						<label>Idade</label>
					</div>
					<select name="destino" class="form-select" aria-label="Default select example">
					  <option selected> Pacote de Viagem </option>
					  <option value="Diamantina">Pacote CHAPADA DIAMANTINA</option>
					  <option value="Veadeiros">Pacote CHAPADA VEADEIROS</option>
					  <option value="Guimaraes">Pacote CHAPADA GUIMARÃES</option>
					  <option value="Mesas">Pacote CHAPADA DAS MESAS </option>
					  <option value="Araripe">Pacote CHAPADA ARARIPE </option>
					</select>
					<br>
					<select name="pagamento" class="form-select" aria-label="Default select example">
					  <option selected> Forma de Pagamento </option>
					  <option value="Crédito"> Cartão de Crédito </option>
					  <option value="Boleto"> Boleto Bancário </option>
					  <option value="Pix"> PIX / Transferência </option>
					</select>	
					<br>
					<button class="btn btn-success" type="submit">Atualizar
						Dados</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>
			</form>
			<br>
		</div>
		
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>