package com.coinMex.architecture.mx.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coinMex.architecture.mx.vo.UsuariosVO;

@Component
public interface UsuariosServices {
	
	public List<UsuariosVO> getUsers();

}
