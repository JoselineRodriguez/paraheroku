# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bio (
  id                            bigserial not null,
  flora                         varchar(255),
  fauna                         varchar(255),
  contaminacionagua             varchar(255),
  contaminacionacustica         varchar(255),
  recomendacion                 varchar(255),
  calidad_id                    bigint,
  departamento_id               bigint,
  municipio_id                  bigint,
  constraint pk_bio primary key (id)
);

create table calidad (
  id                            bigserial not null,
  nombre                        varchar(255),
  constraint pk_calidad primary key (id)
);

create table departamento (
  id                            bigserial not null,
  nombre                        varchar(255),
  constraint pk_departamento primary key (id)
);

create table municipio (
  id                            bigserial not null,
  nombre                        varchar(255),
  constraint pk_municipio primary key (id)
);

alter table bio add constraint fk_bio_calidad_id foreign key (calidad_id) references calidad (id) on delete restrict on update restrict;
create index ix_bio_calidad_id on bio (calidad_id);

alter table bio add constraint fk_bio_departamento_id foreign key (departamento_id) references departamento (id) on delete restrict on update restrict;
create index ix_bio_departamento_id on bio (departamento_id);

alter table bio add constraint fk_bio_municipio_id foreign key (municipio_id) references municipio (id) on delete restrict on update restrict;
create index ix_bio_municipio_id on bio (municipio_id);


# --- !Downs

alter table if exists bio drop constraint if exists fk_bio_calidad_id;
drop index if exists ix_bio_calidad_id;

alter table if exists bio drop constraint if exists fk_bio_departamento_id;
drop index if exists ix_bio_departamento_id;

alter table if exists bio drop constraint if exists fk_bio_municipio_id;
drop index if exists ix_bio_municipio_id;

drop table if exists bio cascade;

drop table if exists calidad cascade;

drop table if exists departamento cascade;

drop table if exists municipio cascade;

