import './App.css';
import { useEffect, useState } from 'react';

function Header(prop){

    const[isExist, setIsExist] = useState(false);
    useEffect(()=>{
        if (localStorage.getItem("username") != null) {
            setIsExist(true);
        } else {
            setIsExist(false);
        }
    },[localStorage.getItem("username")])

    return(
        <ul className="header">
            <li><a className={window.location.pathname == "/home"?"active":""} href='home'>Home</a></li>
            <li><a className={window.location.pathname == "/logout"?"active":""} href='logout'>Logout</a></li>
            <li><a className={window.location.pathname == "/get"?"active":""} href='get'>Get</a></li>
            <li><a className={window.location.pathname == "/post"?"active":""} href='post'>Post</a></li>
            <li><a className={window.location.pathname == "/condition"?"active":""} href='condition'>Condition</a></li>
            {isExist?<li><a href="logout">[logout]</a></li>: null}
        </ul>
    )
}

export default Header;