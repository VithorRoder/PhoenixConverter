PGDMP                      }            phoenixconverterDB    17.4    17.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    16673    phoenixconverterDB    DATABASE     z   CREATE DATABASE "phoenixconverterDB" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'pt-BR';
 $   DROP DATABASE "phoenixconverterDB";
                     postgres    false            �            1259    16674    azulejo    TABLE     �  CREATE TABLE public.azulejo (
    id integer NOT NULL,
    produto character varying,
    tipo character varying,
    papel character varying,
    midia character varying,
    gramatura character varying,
    cor character varying,
    formato character varying,
    quantidade character varying,
    valor character varying,
    valor_min character varying,
    prazo_prod character varying
);
    DROP TABLE public.azulejo;
       public         heap r       postgres    false            �          0    16674    azulejo 
   TABLE DATA           �   COPY public.azulejo (id, produto, tipo, papel, midia, gramatura, cor, formato, quantidade, valor, valor_min, prazo_prod) FROM stdin;
    public               postgres    false    217   �       !           2606    16680    azulejo azulejo_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.azulejo
    ADD CONSTRAINT azulejo_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.azulejo DROP CONSTRAINT azulejo_pkey;
       public                 postgres    false    217            �   �   x�3�t�*�I��WH-*��K�ɬJL��t	q��I��&���F
ɹ���A*
F�:F �������BJf�F���i��V�"�б�j�j�1��"��dCMH2����F:&`CMP5�ahpiRNfn����\C3��Ɩ����i:j(�:s�MGM&XM� �t�pǙBb���� l@�e     