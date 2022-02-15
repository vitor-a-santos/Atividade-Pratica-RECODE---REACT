import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./views/home";
import Pacotes from "./views/pacotes";
import Promocoes from "./views/promocoes";
import Contato from "./views/contato";
import Menu from "./components/Menu";
import Footer from "./components/Footer";
import "./assets/estilo.css";



function App() {
  return (
    <BrowserRouter>
      <Menu  />
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/Pacotes" element={<Pacotes/>} />
        <Route path="/Promocoes" element={<Promocoes/>} />
        <Route path="/Contato" element={<Contato/>} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
