package com.nomcoder.cpmmunity.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements AlphaService {
    @Override
    public String find() {
        return "abc";
    }
}
