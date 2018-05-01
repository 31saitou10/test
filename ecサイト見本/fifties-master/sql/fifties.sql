set names utf8;
set foreign_key_checks = 0;
drop database if exists fifties;

create database if not exists fifties;
use fifties;


/*
 * 会員情報テーブル（木村）
 */

drop table if exists user_info;

create table user_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null unique,
	password varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	sex tinyint default 0,
	email varchar (50) not null,
	status tinyint default 0,
	login_flg tinyint default 0,
	m_flg tinyint default 0,
	insert_date datetime not null,
	update_date datetime,
	question varchar(255) not null,
    answer varchar(255) not null
);

/*
 * 商品情報テーブル（戌亥）
 */

drop table if exists product_info;

create table product_info(
	id int not null primary key auto_increment,
	product_id int not null unique,
	product_name varchar (100) not null unique,
	product_name_kana varchar (100) not null unique,
	product_description varchar (255) not null,
	category_id int not null,
	product_stock int not null,
	price int,
	image_file_path varchar (100),
	image_file_name varchar (50),
	release_date date not null,
	release_company varchar (50),
	status tinyint default 0 not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*カート情報テーブル（山本）
*/

drop table if exists cart_info;

create table cart_info(
	id int not null primary key auto_increment,
	user_id varchar(16),
	temp_user_id varchar(128) not null,
	product_id int not null,
	product_count int not null,
	price int not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*購入履歴情報テーブル（山本）
*/

drop table if exists purchase_history_info;

create table purchase_history_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	product_id int not null,
	product_count int not null,
	price int not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*宛先情報テーブル（林）
*/

drop table if exists destination_info;

create table destination_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	email varchar (32) not null,
	tel_number varchar (13) not null,
	user_address varchar (50) not null,
	postal_code varchar(8) NOT NULL,
	insert_date datetime not null,
	update_date datetime
);

/*
*カテゴリーマスターテーブル（戌亥）
*/

drop table if exists m_category;

create table m_category(
	id int primary key not null auto_increment,
	category_id int not null unique,
	categry_name varchar (20) not null unique,
	category_description varchar (100),
	insert_date datetime not null,
	update_date datetime
);

/*
*問い合わせ情報テーブル(森）
*/

drop table if exists inquiry;

create table inquiry(
	id int primary key not null auto_increment,
	name varchar (100) not null,
	email varchar (255),
	inquiry_type varchar (30),
	inquiry_body varchar (255) ,
	insert_date datetime not null
);

/*
*レビューテーブル（山本）
*/

drop table if exists review;

create table review (
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	product_id int not null,
	review_title varchar (100),
	review_body varchar (255),
	review_score int not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*お気に入りテーブル（中嶋）
*/

drop table if exists favorite_info;

create table favorite_info (
	id int not null primary key auto_increment,
	favorite_id varchar (16) not null,
	product_id int not null,
	insert_date datetime not null
);

/*
 * 会員情報テーブル（木村）
 */

INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana,
	first_name_kana, sex, email, question, answer, m_flg, insert_date)
	VALUES("master", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("taro", "123", "佐藤", "太郎", "さとう", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 0, now()),
		  ("kasumi", "inui", "有村", "架純", "ありむら", "かすみ", "1", "kasumi@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		/*
		 *アドホック試験用管理者ID
		 */
		  ("master1", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master2", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master3", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master4", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master5", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master6", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master7", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master8", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master9", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  ("master10", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com","嫌いな食べ物は？","セロリ", 1, now()),
		  /*
		   * アドホック試験用ID
		   */
		  ("hanako", "123", "山田", "花子", "やまだ", "はなこ", "1", "hanako@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("jiro", "123", "佐藤", "二郎", "さとう", "じろう", "0", "jiro@com", "嫌いな食べ物は？",  "セロリ", 0,  now()),
		  ("siro", "123", "山田", "四郎", "やまだ", "しろう", "0", "siro@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("goro", "123", "山田", "五郎", "やまだ", "五郎", "1", "goro@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("ou", "123", "王", "貞子", "おう", "さだこ", "1", "ou@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("nagashima", "123", "長嶋", "茂子", "ながしま", "しげこ", "1", "shigeko@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("bass", "123", "Bass", "Randy", "ばーす", "らんでぃ", "0", "bass@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("kakefu", "123", "掛布", "雅之", "かけふ", "まさゆき", "0", "kakefu@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("okada", "123", "岡田", "彰布", "おかだ", "あきのぶ", "0", "okada@com", "嫌いな食べ物は？", "セロリ", 0, now()),
		  ("nakata", "123", "中田", "翔", "なかた", "しょう", "0", "nakata@com", "嫌いな食べ物は？", "セロリ", 0, now());

/*
*管理者アカウント（藤澤）
*/

INSERT INTO product_info(product_id,product_name,product_name_kana,product_description,category_id,product_stock,price,image_file_path,image_file_name,release_date,release_company,status,insert_date,update_date)
VALUES(0,"レトロフォン","れとろふぉん","デッドストック！レトロデザイン電話機。人気の商品です","3","30","5000","./images/telephone.jpg","レトロなテレフォンです。",19500101,"OldCompany",0,now(),now()),
(1,"グリーンランプ","ぐりーんらんぷ","レアなヴィンテージ。アメリカから来た緑色のランプです。","3","30","3000","./images/kaden/greenLamp.jpg","緑のランプです",19500101,"OldCompany",0,now(),now()),
(2,"レコードプレーヤー","れこーどぷれーやー","新商品！おしゃれなデザインのレコードプレーヤーです。","3","30","10000","./images/kaden/mig.jpg","おしゃれなレコードプレーヤーです",19500101,"OldCompany",0,now(),now()),
(3,"トースター","とーすたー","おちゃめな焼き色のつく楽しいトースター！明るい朝の食卓に！","3","30","6000","./images/kaden/Toster.jpg","レトロなトースターです。",19500101,"OldCompany",0,now(),now()),
(4,"冷蔵庫","れいぞうこ","かわいすぎるピンクのレトロデザイン冷蔵庫。","3","30","80000","./images/kaden/refrigerator.jpg","レトロデザインの冷蔵庫です。",19500101,"OldCompany",0,now(),now()),
(5,"コーヒーメーカー","こーひーめーかー","クールなデザインのコーヒーメーカー。おすすめ商品です","3","30","30000","./images/kaden/coffeeMeker.jpg","かっこいいコーヒーメーカーです。",19500101,"OldCompany",0,now(),now()),
(6,"ストーブ","すとーぶ","人気商品！おしゃれなストーブです。お早めに！","3","30","80000","./images/kaden/stobe.jpg","おしゃれなストーブです。",19500101,"OldCompany",0,now(),now()),
(7,"ヘアスプレー","へあすぷれー","超人気作！楽しいミュージカルです。","2","30","4000","./images/Movie/hairspray.jpg","hairspray",19500101,"OldMovieCompany",0,now(),now()),
(8,"ロッキーホラーショー","ろっきーほらーしょー","定番人気！歌って踊る怖い映画です。ハロウィンにもおすすめ","2","30","4000","./images/Movie/rocky.jpg","ロッキーホラーショー",19500101,"OldMovieCompany",0,now(),now()),
(9,"ワンダーウォール","わんだーうぉーる","おしゃれかわいい映画です。女性におすすめ。","2","30","4000","./images/Movie/wonder.jpg","ワンダーウォール",19500101,"OldMovieCompany",0,now(),now()),
(10,"ひなぎく","ひなぎく","有名作！ガーリーな映画です。","2","30","4000","./images/Movie/hinagiku.jpg","ひなぎく",19500101,"OldMovieCompany",0,now(),now()),
(11,"ロシュフォールの恋人たち","ろしゅふぉーるのこいびとたち","有名な曲をたくさん生んだ名作フレンチミュージカルです。","2","30","4000","./images/Movie/rochehole.jpg","ロシュフォール",19500101,"OldMovieCompany",0,now(),now()),
(12,"ジュマンジ","じゅまんじ","最後まで目が離せない！どきどきの冒険映画です。","2","30","4000","./images/Movie/jumanji.jpg","ジュマンジ",19500101,"OldMovieCompany",0,now(),now()),
(13,"サンダーバード","さんだーばーど","アメリカからきたミントカラーのサンダーバード。クラシックな見た目がとても目を引きます。","1","30","100000","./images/car/1280px-T-bird.jpg","サンダー",19500101,"OldCarCompany",0,now(),now()),
(14,"シボレークラシック","しぼれーくらしっく","真っ赤なシボレー。注目度抜群です。","1","30","100000","./images/car/1968chevelle.jpg","シボレー",19500101,"OldCarCompany",0,now(),now()),
(15,"フィアット","ふぃあっと","とてもかわいい黄色いフィアット。コンパクトで乗りやすい車です。","1","30","100000","./images/car/fiat.jpg","フィアット",19500101,"OldCarCompany",0,now(),now()),
(16,"フィアットピンク","ふぃあっとぴんく","とてもかわいいピンクのフィアット。コンパクトで乗りやすい車です。","1","30","100000","./images/car/fiat2.jpg","ピンクフィアット",19500101,"OldCarCompany",0,now(),now()),
(17,"光岡","みつおか","おしゃれデザインの国産車！ベージュのボディが上品です。","1","30","100000","./images/car/mitsuoka.jpg","ミツオカ",19500101,"OldCarCompany",0,now(),now()),
(18,"フィアットパンダ","ふぃあっとぱんだ","人気車種！カジュアルでとても人気のある車です。","1","30","100000","./images/car/panda.jpg","パンダ",19500101,"OldCarCompany",0,now(),now()),
(19,"ビートル","びーとる","レトロなタイプのビートル。人気色を入荷しました。","1","30","100000","./images/car/wagen.jpg","フォルクスワーゲン",19500101,"OldCarCompany",0,now(),now());


INSERT INTO destination_info(user_id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address, postal_code, insert_date)
VALUES("taro", "佐藤", "太郎", "さとう", "たろう", "internousdev@fifties.com", "090-0000-0000", "東京都千代田区3番町インターノウス", "123-4567", now()),
	  ("taro", "佐藤", "太郎", "さとう", "たろう", "internousdev@fifties.com", "090-0000-0000", "東京都渋谷区2番町", "890-1234", now());


INSERT INTO review(user_id, product_id, review_title, review_body, review_score, insert_date)
VALUES("taro", 1, "かっこいい", "とてもかっこいいランプだと思います", 5, now()),
	  ("jiro", 1, "明るい", "明るくて作業しやすいです", 4, now()),
	  ("hanako", 1, "緑がすてき", "色がとてもいい緑です！", 5, now()),
	  ("goro", 1, "使いづらい", "照明のあたる範囲がせまくて使いにくい", 1, now());
