package com.ista.gadi.Services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Usuario_Dao;
import com.ista.gadi.Entity.Usuario;

@Service
public class Usuariolmpl implements UsuarioService {

    @Autowired
    private I_Usuario_Dao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        if (usuario.getContrasena() != null && !usuario.getContrasena().startsWith("$2a$")) {
            usuario.setContrasena(BCrypt.hashpw(usuario.getContrasena(), BCrypt.gensalt()));
        }
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findbyId(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        usuarioDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findByIdPersona(Long idPersona) {
        return usuarioDao.findByIdPersona(idPersona).orElse(null);
    }
}
