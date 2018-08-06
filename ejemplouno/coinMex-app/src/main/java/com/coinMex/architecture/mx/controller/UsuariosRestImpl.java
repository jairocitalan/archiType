package com.coinMex.architecture.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.coinMex.architecture.mx.services.UsuariosServices;
import com.coinMex.architecture.mx.vo.UsuariosVO;

@RestController
@RequestMapping(path="api/v1")
public class UsuariosRestImpl implements UsuariosRest {
	
	@Autowired
	UsuariosServices usuariosServices;

	@Override
	@RequestMapping(path = "/getUsers", method = RequestMethod.GET)
	public List<UsuariosVO> getUsers() {
		return usuariosServices.getUsers();
	}
	
}
