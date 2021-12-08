<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="nk-header nk-header-fixed is-light">
					<div class="container-fluid">
						<div class="nk-header-wrap">
							<div class="nk-menu-trigger d-xl-none ml-n1">
								<a href="#" class="nk-nav-toggle nk-quick-nav-icon"
									data-target="sidebarMenu"><em class="icon ni ni-menu"></em></a>
							</div>
							
							<!-- .nk-header-brand -->
							<div class="nk-header-search ml-3 ml-xl-0">
								<em class="icon ni ni-search"></em> <input type="text"
									class="form-control border-transparent form-focus-none"
									placeholder="Recherche">
							</div>
							<!-- .nk-header-news -->

							<div class="nk-header-tools">
								<ul class="nk-quick-nav">
									
									
									<li class="dropdown user-dropdown"><a href="#"
										class="dropdown-toggle mr-n1" data-toggle="dropdown">
											<div class="user-toggle">
												<div class="user-avatar sm">
													<em class="icon ni ni-user-alt"></em>
												</div>
												<div class="user-info d-none d-xl-block">
													<div class="user-status user-status-unverified">${groupe}</div>
													<div class="user-name dropdown-indicator">${usernname}</div>
												</div>
											</div>
									</a>
										<div
											class="dropdown-menu dropdown-menu-md dropdown-menu-right">
											<div
												class="dropdown-inner user-card-wrap bg-lighter d-none d-md-block">
												<div class="user-card">
													<div class="user-avatar">
														<span>${currentuser.getNom().substring(0,1)}${currentuser.getPrenom().substring(0,1)}</span>
													</div>
													<div class="user-info">
														<span class="lead-text">${usernname}</span> <span
															class="sub-text">${currentuser.getMail()}</span>
													</div>
												</div>
											</div>
											<div class="dropdown-inner">
												<ul class="link-list">
													<li><a href="html/user-profile-regular.html"><em
															class="icon ni ni-user-alt"></em><span>Voir mon
																profil</span></a></li>
													<li><a href="html/user-profile-setting.html"><em
															class="icon ni ni-setting-alt"></em><span>Paramètre
																du compte</span></a></li>
												</ul>
											</div>
											<div class="dropdown-inner">
												<ul class="link-list">
													<li><a href="Disconnection"><em class="icon ni ni-signout"></em><span>Déconnexion</span></a></li>
												</ul>
											</div>
										</div></li>
								</ul>
							</div>
						</div>
						<!-- .nk-header-wrap -->
					</div>
					<!-- .container-fliud -->
				</div>