package com.deepexi.test.controller;

import com.deepexi.test.service.UserService;
import com.deepexi.test.domain.eo.User;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/api/v1/users")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @GET
    @Path("/")
    public Payload findPage(@BeanParam User eo,
                            @QueryParam("page") @DefaultValue("1")  Integer page,
                            @QueryParam("size") @DefaultValue("10")  Integer size) {
        return new Payload(userService.findPage(eo,page, size));
    }


    @GET
    @Path("/list")
    public Payload findAll(@BeanParam User eo) {
        return new Payload(userService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") Integer  pk) {
        return new Payload(userService.detail(pk));
    }

    @POST
    @Path("/")
    public Payload create(User eo) {
        return new Payload(userService.create(eo));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") Integer  pk, User eo) {
        return new Payload(userService.update(pk,eo));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") Integer  pk) {
        return new Payload(userService.delete(pk));
    }

    @DELETE
    @Path("/")
    public Payload delete(Integer [] pks) {
        return new Payload(userService.delete(pks));
    }
}
