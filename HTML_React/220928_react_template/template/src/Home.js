import './App.css';
import Header from "./Header";
import Footer from "./Footer";

function Home(){
    return(
        <body>
            <Header/>
            
            <div className="banner-wrapper bg-light">
                <div id="index_banner" className="banner-vertical-center-index container-fluid pt-5">

                    <div id="carouselExampleIndicators" className="carousel slide" data-bs-ride="carousel">
                        <ol className="carousel-indicators">
                            <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" className="active"></li>
                            <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"></li>
                            <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"></li>
                        </ol>
                        <div className="carousel-inner">
                            <div className="carousel-item active">

                                <div className="py-5 row d-flex align-items-center">
                                    <div className="banner-content col-lg-8 col-8 offset-2 m-lg-auto text-left py-5 pb-5">
                                        <h1 className="banner-heading h1 text-secondary display-3 mb-0 pb-5 mx-0 px-0 light-300 typo-space-line">
                                            Develop <strong>Strategies</strong> for
                                          <br/>your business
                                        </h1>
                                        <p className="banner-body text-muted py-3 mx-0 px-0">
                                            Purple Buzz is a corporate HTML template with Bootstrap 5 Beta 1. This CSS template is 100% free to download provided by <a rel="nofollow" href="https://templatemo.com/page/1" target="_parent">TemplateMo</a>. Total 6 HTML pages included in this template. Icon fonts by <a rel="nofollow" href="https://boxicons.com/" target="_blank">Boxicons</a>. Photos are from <a rel="nofollow" href="https://unsplash.com/" target="_blank">Unsplash</a> and <a rel="nofollow" href="https://icons8.com/" target="_blank">Icons 8</a>.
                                      </p>
                                        <a className="banner-button btn rounded-pill btn-outline-primary btn-lg px-4" href="#" role="button">Get Started</a>
                                    </div>
                                </div>

                            </div>
                            <div className="carousel-item">

                                <div className="py-5 row d-flex align-items-center">
                                    <div className="banner-content col-lg-8 col-8 offset-2 m-lg-auto text-left py-5 pb-5">
                                        <h1 className="banner-heading h1 text-secondary display-3 mb-0 pb-3 mx-0 px-0 light-300">
                                            HTML CSS Template with Bootstrap 5 Beta 1
                                        </h1>
                                        <p className="banner-body text-muted py-3">
                                            You are not allowed to re-distribute this Purple Buzz HTML template as a downloadable ZIP file on any kind of Free CSS collection websites. This is strongly prohibited. Please contact TemplateMo for more information.
                                        </p>
                                        <a className="banner-button btn rounded-pill btn-outline-primary btn-lg px-4" href="#" role="button">Get Started</a>
                                    </div>
                                </div>

                            </div>
                            <div className="carousel-item">

                                <div className="py-5 row d-flex align-items-center">
                                    <div className="banner-content col-lg-8 col-8 offset-2 m-lg-auto text-left py-5 pb-5">
                                        <h1 className="banner-heading h1 text-secondary display-3 mb-0 pb-3 mx-0 px-0 light-300">
                                            Cupidatat non proident, sunt in culpa qui officia
                                        </h1>
                                        <p className="banner-body text-muted py-3">
                                            Ut enim ad minim veniam, quis nostrud exercitation ullamco
                                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute
                                            irure dolor in reprehenderit in voluptate velit esse cillum
                                            dolore eu fugiat nulla pariatur. Excepteur sint occaecat.
                                        </p>
                                        <a className="banner-button btn rounded-pill btn-outline-primary btn-lg px-4" href="#" role="button">Get Started</a>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <a className="carousel-control-prev text-decoration-none" href="#carouselExampleIndicators" role="button" data-bs-slide="prev">
                            <i className='bx bx-chevron-left'></i>
                            <span className="visually-hidden">Previous</span>
                        </a>
                        <a className="carousel-control-next text-decoration-none" href="#carouselExampleIndicators" role="button" data-bs-slide="next">
                            <i className='bx bx-chevron-right'></i>
                            <span className="visually-hidden">Next</span>
                        </a>
                    </div>

                </div>
            </div>



            <section className="service-wrapper py-3">
                <div className="container-fluid pb-3">
                    <div className="row">
                        <h2 className="h2 text-center col-12 py-5 semi-bold-600">Services</h2>
                        <div className="service-header col-2 col-lg-3 text-end light-300">
                            <i className='bx bx-gift h3 mt-1'></i>
                        </div>
                        <div className="service-heading col-10 col-lg-9 text-start float-end light-300">
                            <h2 className="h3 pb-4 typo-space-line">Make Success for future</h2>
                        </div>
                    </div>
                    <p className="service-footer col-10 offset-2 col-lg-9 offset-lg-3 text-start pb-3 text-muted px-2">
                        You are free to use this template for your commercial or business websites. You are not allowed to re-distribute this template ZIP file on any template collection websites. It is too easy to illegally copy and repost this template.
                    </p>
                </div>

                <div className="service-tag py-5 bg-secondary">
                    <div className="col-md-12">
                        <ul className="nav d-flex justify-content-center">
                            <li className="nav-item mx-lg-4">
                                <a className="filter-btn nav-link btn-outline-primary active shadow rounded-pill text-light px-4 light-300" href="#" data-filter=".project">All</a>
                            </li>
                            <li className="nav-item mx-lg-4">
                                <a className="filter-btn nav-link btn-outline-primary rounded-pill text-light px-4 light-300" href="#" data-filter=".graphic">Graphics</a>
                            </li>
                            <li className="filter-btn nav-item mx-lg-4">
                                <a className="filter-btn nav-link btn-outline-primary rounded-pill text-light px-4 light-300" href="#" data-filter=".ui">UI/UX</a>
                            </li>
                            <li className="nav-item mx-lg-4">
                                <a className="filter-btn nav-link btn-outline-primary rounded-pill text-light px-4 light-300" href="#" data-filter=".branding">Branding</a>
                            </li>
                        </ul>
                    </div>
                </div>

            </section>

            <section className="container overflow-hidden py-5">
                <div className="row gx-5 gx-sm-3 gx-lg-5 gy-lg-5 gy-3 pb-3 projects">

                    <div className="col-xl-3 col-md-4 col-sm-6 project ui branding">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="service card-img" src="img/services-01.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">UI/UX design</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project ui graphic">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-02.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Social Media</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project branding">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-03.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Marketing</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project ui graphic">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-04.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Graphic</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project ui graphic">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-05.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Digtal Marketing</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project branding">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-06.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Market Research</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project branding">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-07.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Business</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                    <div className="col-xl-3 col-md-4 col-sm-6 project ui graphic branding">
                        <a href="#" className="service-work card border-0 text-white shadow-sm overflow-hidden mx-5 m-sm-0">
                            <img className="card-img" src="img/services-08.jpg" alt="Card image"/>
                            <div className="service-work-vertical card-img-overlay d-flex align-items-end">
                                <div className="service-work-content text-left text-light">
                                    <span className="btn btn-outline-light rounded-pill mb-lg-3 px-lg-4 light-300">Branding</span>
                                    <p className="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing</p>
                                </div>
                            </div>
                        </a>
                    </div>

                </div>
            </section>






            <section className="bg-secondary">
                <div className="container py-5">
                    <div className="row d-flex justify-content-center text-center">
                        <div className="col-lg-2 col-12 text-light align-items-center">
                            <i className='display-1 bx bxs-box bx-lg'></i>
                        </div>
                        <div className="col-lg-7 col-12 text-light pt-2">
                            <h3 className="h4 light-300">Great transformations successful</h3>
                            <p className="light-300">Quis ipsum suspendisse ultrices gravida.</p>
                        </div>
                        <div className="col-lg-3 col-12 pt-4">
                            <a href="#" className="btn btn-primary rounded-pill btn-block shadow px-4 py-2">View Our Work</a>
                        </div>
                    </div>
                </div>
            </section>

            <section className="py-5 mb-5">
                <div className="container">
                    <div className="recent-work-header row text-center pb-5">
                        <h2 className="col-md-6 m-auto h2 semi-bold-600 py-5">Recent Works</h2>
                    </div>
                    <div className="row gy-5 g-lg-5 mb-4">

                        <div className="col-md-4 mb-3">
                            <a href="#" className="recent-work card border-0 shadow-lg overflow-hidden">
                                <img className="recent-work-img card-img" src="img/recent-work-01.jpg" alt="Card image"/>
                                <div className="recent-work-vertical card-img-overlay d-flex align-items-end">
                                    <div className="recent-work-content text-start mb-3 ml-3 text-dark">
                                        <h3 className="card-title light-300">Social Media</h3>
                                        <p className="card-text">Ullamco laboris nisi ut aliquip ex</p>
                                    </div>
                                </div>
                            </a>
                        </div>

                        <div className="col-md-4 mb-3">
                            <a href="#" className="recent-work card border-0 shadow-lg overflow-hidden">
                                <img className="recent-work-img card-img" src="img/recent-work-02.jpg" alt="Card image"/>
                                <div className="recent-work-vertical card-img-overlay d-flex align-items-end">
                                    <div className="recent-work-content text-start mb-3 ml-3 text-dark">
                                        <h3 className="card-title light-300">Web Marketing</h3>
                                        <p className="card-text">Psum officia anim id est laborum.</p>
                                    </div>
                                </div>
                            </a>
                        </div>

                        <div className="col-md-4 mb-3">
                            <a href="#" className="recent-work card border-0 shadow-lg overflow-hidden">
                                <img className="recent-work-img card-img" src="img/recent-work-03.jpg" alt="Card image"/>
                                <div className="recent-work-vertical card-img-overlay d-flex align-items-end">
                                    <div className="recent-work-content text-start mb-3 ml-3 text-dark">
                                        <h3 className="card-title light-300">R & D</h3>
                                        <p className="card-text">Sum dolor sit consencutur</p>
                                    </div>
                                </div>
                            </a>
                        </div>

                        <div className="col-md-4 mb-3">
                            <a href="#" className="recent-work card border-0 shadow-lg overflow-hidden">
                                <img className="recent-work-img card-img" src="img/recent-work-04.jpg" alt="Card image"/>
                                <div className="recent-work-vertical card-img-overlay d-flex align-items-end">
                                    <div className="recent-work-content text-start mb-3 ml-3 text-dark">
                                        <h3 className="card-title light-300">Public Relation</h3>
                                        <p className="card-text">Lorem ipsum dolor sit amet</p>
                                    </div>
                                </div>
                            </a>
                        </div>

                        <div className="col-md-4 mb-3">
                            <a href="#" className="recent-work card border-0 shadow-lg overflow-hidden">
                                <img className="recent-work-img card-img" src="img/recent-work-05.jpg" alt="Card image"/>
                                <div className="recent-work-vertical card-img-overlay d-flex align-items-end">
                                    <div className="recent-work-content text-start mb-3 ml-3 text-dark">
                                        <h3 className="card-title light-300">Branding</h3>
                                        <p className="card-text">Put enim ad minim veniam</p>
                                    </div>
                                </div>
                            </a>
                        </div>

                        <div className="col-md-4 mb-3">
                            <a href="#" className="recent-work card border-0 shadow-lg overflow-hidden">
                                <img className="recent-work-img card-img" src="img/recent-work-06.jpg" alt="Card image"/>
                                <div className="recent-work-vertical card-img-overlay d-flex align-items-end">
                                    <div className="recent-work-content text-start mb-3 ml-3 text-dark">
                                        <h3 className="card-title light-300">Creative Design</h3>
                                        <p className="card-text">Mollit anim id est laborum.</p>
                                    </div>
                                </div>
                            </a>
                        </div>

                    </div>
                </div>
            </section>

            <Footer/>
        </body>
    )
}
//export the function to use in other component
export default Home;