import React from "react";

export default function promocoes() {
    return (
        <>
            <br />

            <div class="cold-md-7" />

            <div class="row">
                <button class="btn btn-danger" > <h3> PROMOÇÕES </h3> </button>
            </div>
            <br />

            <div class="row row-cols-1 row-cols-md-3 g-4">
                <div class="col">
                    <div class="card">
                        <img src="./img/reveillon-rio.jpg" class="card-img-top" alt="..." />
                        <div class="card-body">
                            <h5 class="card-title">REVEILLON RIO</h5>
                            <p class="card-text">Incluso AÉREO + HOSPEDAGEM + TRANSFER</p>
                            <div class="row">
                                <button class="btn btn-danger" > R$ 1.199,99 </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card" width="18rem;">
                        <img src="./img/carnaval-olinda.jpg" class="card-img-top" alt="..." />
                        <div class="card-body">
                            <h5 class="card-title"> CARNAVAL OLINDA </h5>
                            <p class="card-text">Incluso AÉREO + HOSPEDAGEM + TRANSFER</p>
                            <div class="row">
                                <button class="btn btn-danger" > R$ 1.499,99 </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card" width="18rem;">
                        <img src="./img/festival-parintins.jpg" class="card-img-top" alt="..." />
                        <div class="card-body">
                            <h5 class="card-title"> FESTIVAL DE PARINTIS </h5>
                            <p class="card-text">Incluso AÉREO + HOSPEDAGEM + TRANSFER</p>
                            <div class="row">
                                <button class="btn btn-danger"> R$ 1.999,99 </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card" width="18rem;">
                        <img src="./img/foz do iguaçu.jpg" class="card-img-top" alt="..." />
                        <div class="card-body">
                            <h5 class="card-title"> FOZ DO IGUAÇU </h5>
                            <p class="card-text">Incluso AÉREO + HOSPEDAGEM + TRANSFER</p>
                            <div class="row">
                                <button class="btn btn-danger"> R$ 999,99 </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>




        </>
    );
}