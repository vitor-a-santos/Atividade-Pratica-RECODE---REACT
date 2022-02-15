import React from "react";

export default function Contato() {
    return (
        <>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


            <br />
            <div class="container" />
            <div class="row" />
            <div class="cold-md-7" />

            <div class="row">
                <button class="btn btn-primary" > <h3> Solicitação de Viagem: </h3> </button>
            </div>

            <div id="contato">
                <p> <img src="./img/contato.jpg" /> </p>
            </div>

            <br/> 
            <form class="row g-3" />
            <div class="form-floating mb-3">
                <input name="Nome" maxlength="40" type="text" class="form-control" id="floatingInput1" placeholder=" Nome" />
                <label> Nome completo </label>
            </div>
            <div class="form-floating mb-3">
                <input name="Telfone" maxlength="2" type="text" class="form-control" placeholder=" number" />
                <label> Telefone </label>
            </div>


            <div class="row">
                <div class="col">
                    <label> <b> Data de Ida </b> </label>
                    <input type="date" class="form-control" placeholder="ida" aria-label="ida" />
                </div>
                <div class="col">
                    <label><b> Data de Volta </b></label>
                    <input type="date" class="form-control" placeholder="volta" aria-label="volta" />
                </div>
            </div>

            <br />

            <select name="Destino" class="form-select" aria-label="Default select example">
                <option selected> Pacote de Viagem </option>
                <option value="1">Pacote CHAPADA DIAMANTINA</option>
                <option value="2">Pacote CHAPADA VEADEIROS</option>
                <option value="3">Pacote CHAPADA GUIMARÃES</option>
                <option value="4">Pacote CHAPADA DAS MESAS </option>
                <option value="5"> *PROMOÇÃO* REVEILLON RIO </option>
                <option value="6"> *PROMOÇÃO* CARNAVAL OLINDA </option>
                <option value="7"> *PROMOÇÃO* FESTIVAL PARINTINS </option>
                <option value="8"> *PROMOÇÃO* FOZ DO IGUAÇU </option>
            </select>
            <br />
            <select name="Pag_pax" class="form-select" aria-label="Default select example">
                <option selected> Forma de Pagamento </option>
                <option value="1"> Cartão de Crédito </option>
                <option value="2"> Boleto Bancário </option>
                <option value="3"> PIX / Transferência </option>
            </select>

            <br />
            <div class="row">
                <button class="btn btn-primary" type="submit"> Solicitar Viagem </button>
                <br />
                <button class="btn btn-dark" type="reset"> Limpar ficha </button>
            </div>
            <br />

            

        </>
    );
}