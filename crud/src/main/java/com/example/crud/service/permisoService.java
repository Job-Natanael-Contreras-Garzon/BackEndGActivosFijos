package com.example.crud.service;

import com.proyecto.assetfix_backend.model.Permiso;
import com.proyecto.assetfix_backend.repository.permisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class permisoService implements permisoRepository {
    @Autowired
    private permisoRepository permisoRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Permiso> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Permiso> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Permiso> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Permiso getOne(Long aLong) {
        return null;
    }

    @Override
    public Permiso getById(Long aLong) {
        return null;
    }

    @Override
    public Permiso getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Permiso> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Permiso> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Permiso> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public List<Permiso> findAll() {
        return permisoRepository.findAll();
    }

    @Override
    public List<Permiso> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public <S extends Permiso> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Permiso> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Permiso entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Permiso> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Permiso> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Permiso> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Permiso> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Permiso> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Permiso> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Permiso> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Permiso, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
