import React, {useState} from 'react';
import { Link } from 'react-router-dom';
import './NavBar.css';




//function => arrow func -vykonava jen jednu funkci
//u Link to='/' - homepage
function NavBar() {
    
//useState standartni react funkce 
const [click, setClick] =  useState(false);
//zmeni hodnotu setKliku oproti aktualnimu
const handleClick = () => setClick(!click);
const closeMobileMenu = () => setClick(false);

  return (
   <>
    <nav className='navbar'>

            <div className='navbar-container'>

                <Link to='/' className='navbar-logo' onClick={closeMobileMenu}>
                    LOGO
                </Link>

                <div className='menu-icon' onClick={handleClick}>
                    <i className={click ? 'fa fa-times' : 'fa fa-bars'}/>
                </div>

                <ul className={click ? 'nav-menu active' : 'nav-menu'}>
                   
                    <li className='nav-item'>
                        <Link to='/' className='nav-links' onClick={closeMobileMenu}>
                            Home
                        </Link>                           
                    </li>
                    <li className='nav-item'>
                        <Link to='/about' className='nav-links' onClick={closeMobileMenu}>
                           About
                        </Link>                           
                    </li>
                    <li className='nav-item'>
                        <Link to='/users' className='nav-links' onClick={closeMobileMenu}>
                          Users
                        </Link>                           
                    </li>

                </ul>

            </div>
    </nav>
   </>
  )
}

export default NavBar