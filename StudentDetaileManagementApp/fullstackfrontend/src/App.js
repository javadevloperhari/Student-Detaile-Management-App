import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./Layout/navbar"
import Home from "./pages/home"

function App() {
  return (
    <div className="App">
      

     <Navbar></Navbar>
     <Home></Home>
    </div>
  );
}

export default App;
