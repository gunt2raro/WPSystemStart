package com.wpsystem.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.wpsystem.business.UserService;
import com.wpsystem.business.UserServiceImp;
import com.wpsystem.data.UserDao;
import com.wpsystem.data.UserDaoImp;
import com.wpsystem.web.UserResource;

public class GuiceConfig extends GuiceServletContextListener
{
    @Override
    protected Injector getInjector()
    {
        return Guice.createInjector(new JerseyServletModule()
        {
            @Override
            protected void configureServlets()
            {
                bind(UserResource.class);
                bind(UserService.class).to(UserServiceImp.class);
                bind(UserDao.class).to(UserDaoImp.class);
                serve("/*").with(GuiceContainer.class);
            }
        });
    }
}