PGDMP  /    /                }            phoenixconverterDB    17.4    17.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
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
       public         heap r       postgres    false            �            1259    16681    bone    TABLE     �  CREATE TABLE public.bone (
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
    DROP TABLE public.bone;
       public         heap r       postgres    false            �            1259    16688    caneca    TABLE     �  CREATE TABLE public.caneca (
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
    DROP TABLE public.caneca;
       public         heap r       postgres    false            �          0    16674    azulejo 
   TABLE DATA           �   COPY public.azulejo (id, produto, tipo, papel, midia, gramatura, cor, formato, quantidade, valor, valor_min, prazo_prod) FROM stdin;
    public               postgres    false    217   �       �          0    16681    bone 
   TABLE DATA           �   COPY public.bone (id, produto, tipo, papel, midia, gramatura, cor, formato, quantidade, valor, valor_min, prazo_prod) FROM stdin;
    public               postgres    false    218   m       �          0    16688    caneca 
   TABLE DATA           �   COPY public.caneca (id, produto, tipo, papel, midia, gramatura, cor, formato, quantidade, valor, valor_min, prazo_prod) FROM stdin;
    public               postgres    false    219   	       )           2606    16680    azulejo azulejo_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.azulejo
    ADD CONSTRAINT azulejo_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.azulejo DROP CONSTRAINT azulejo_pkey;
       public                 postgres    false    217            +           2606    16687    bone bone_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.bone
    ADD CONSTRAINT bone_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.bone DROP CONSTRAINT bone_pkey;
       public                 postgres    false    218            -           2606    16694    caneca caneca_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.caneca
    ADD CONSTRAINT caneca_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.caneca DROP CONSTRAINT caneca_pkey;
       public                 postgres    false    219            �   �   x�3�t�*�I��WH-*��K�ɬJL��t	q��I��&���F
ɹ���A*
F�:F �������BJf�F���i��V�"�б�j�j�1��"��dCMH2����F:&`CMP5�ahpiRNfn����\C3��Ɩ����i:j(�:s�MGM&XM� �t�pǙBb���� l@�e      �   �   x���t��;�R! ��8?/1'�*1%�3�4)'37���Ë�9c� j@Ǫ������ϐ3HE��@�� �03�11�4VH�L�(���24 �l���Ҵ����\"�6$����D�Ģ|"�6"��Ԣ�Ԝ"L����� eDs�      �   �  x���AO�0���+8x���BK��2��Y��i��5B�+�D���i��?�P��� p#M�����^�b+b3>aεb�	��O�������?E�Y��/R�\�bٵOL�*>|T|`g����Y�vI5l �|-���`>���i"X����QE�JB@�G�]��`��L�p"����g�S@ 64b%��|���))ش�-ն��K��UI�c]���g<�7`�/����g�6ɮy���@�EKmb�v#]v�]�,\u�kj�v#@��+Q$����@h/4bic�� �l����e��� y������I�qي���v��R7re�]�K��g�Ԋۅ����yd�E��a��ŢXf��%��K��^,"��Cp|�`␡q�ˁA�Ĉ�B`X�o���S ���s�4�V��B&�ؤ
��d�"Y��qM_?+(xV�)��fܳm����     