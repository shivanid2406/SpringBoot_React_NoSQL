import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./Pages/Home";
import Feed from "./Pages/Feed";
import Create from "./Pages/Create";
import Dashboard from "./Pages/Dashboard";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />}></Route>
        <Route path="/employer"></Route>
        <Route path="/employer/dashboard" element={<Dashboard />}></Route>
        <Route path="/employer/create" element={<Create />}></Route>
        <Route path="/employer/feed" element={<Feed />}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
