import React from "react";
import { Link } from "react-router-dom";
import { Typography, Button } from "@mui/material";
import "../App.css";

const Home = () => {
  return (
    <div>
      <Typography sx={{ margin: "5%" }} variant="h3" align="center">
        Get Hired or Hire people!
      </Typography>
      <div>
        <ul className="ul">
          <li>
            <Button sx={{ margin: "2% 3%" }} variant="outlined">
              <Link to="/employer/dashboard">Hire Talent</Link>
            </Button>
          </li>
          <li>
            <Button sx={{ margin: "2% 3%" }} variant="outlined">
              <Link to="/employer/feed">Get Job Now</Link>
            </Button>
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Home;
