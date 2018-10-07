///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.seratic.universidad.utils;
//
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//
///**
// *
// * @author danny
// */
//@Converter(autoApply = true)
//public class LocalDateConverter  implements AttributeConverter<LocalDateTime, Timestamp> {
//    @Override
//    public Timestamp convertToDatabaseColumn(LocalDateTime locDateTime) {
//    	return (locDateTime == null ? null : Timestamp.valueOf(locDateTime));
//    }
//
//    @Override
//    public LocalDateTime convertToEntityAttribute(Timestamp sqlTimestamp) {
//    	return (sqlTimestamp == null ? null : sqlTimestamp.toLocalDateTime());
//    }
//}