package com.coinMex.architecture.mx.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coinMex.architecture.mx.dao.UsuariosDAO;
import com.coinMex.architecture.mx.model.UsuariosDO;
import com.coinMex.architecture.mx.services.UsuariosServices;
import com.coinMex.architecture.mx.vo.UsuariosVO;


@Service
public class UsuariosServiceImpl implements UsuariosServices{

	@Autowired
	UsuariosDAO usuariosDAO;
	
	@Override
	public List<UsuariosVO> getUsers() {
		List<UsuariosDO> listUsers = usuariosDAO.findAll();
		
		return listUsers.stream().map(x -> new UsuariosVO() {{
			setId_user(x.getId_user());
			setName(x.getName());
			setEmail(x.getEmail());
			setUser(x.getUser());
			setPassword(x.getPassword());
			setId_perfil(x.getId_perfil());
		    setNum_acount(x.getNum_acount());	
		}}).collect(Collectors.toList());
		
	}
	
	
	

}
