# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "smi" ("id" INTEGER NOT NULL PRIMARY KEY,"ro_number" VARCHAR NOT NULL);

# --- !Downs

drop table "smi";

