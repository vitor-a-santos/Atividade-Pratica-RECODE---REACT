import React from "react";
import { Link } from "react-router-dom";

export default function Menu() {

    return (

        <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark ">

            <div class="container-fluid">
                <Link to="/"> <img src="./img/gnomoTur.png" alt="Gnomo Turismo" width="100px" /></Link>
            </div>
            <div class="container-fluid">
                <Link to="/pacotes"> Nossos Pacotes </Link>
            </div>
            <div class="container-fluid">
                <Link to="/promocoes"> Promoções Especiais </Link>
            </div>
            <div class="container-fluid">
                <Link to="/contato"> Fale Conosco </Link>
            </div>
           
        </nav>




    );
}