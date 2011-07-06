package com.mysema.query.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import org.junit.Ignore;

@Ignore
@SuppressWarnings("serial")
public class EmbeddableDeepTest {

    public enum SomeType {
        a, b;
    }

    @MappedSuperclass
    public abstract class AValueObject implements Cloneable, Serializable {

    }

    @MappedSuperclass
    public abstract class AEntity extends AValueObject {

    }

    // JPA

    @Entity
    public class A extends AEntity {

        @Embedded
        B b;

    }

    @Embeddable
    public class B extends AValueObject {

        @Embedded
        C c;

    }

    @Embeddable
    public class C extends AValueObject {

        SomeType someType;

    }

    // plain

//    @QueryEntity
//    public class AA extends AValueObject {
//
//        @QueryEmbedded
//        BB b;
//
//    }
//
//    @QueryEmbeddable
//    public class BB extends AValueObject {
//
//        @QueryEmbedded
//        CC c;
//
//    }
//
//    @QueryEmbeddable
//    public class CC extends AValueObject {
//
//        SomeType someType;
//
//    }

}