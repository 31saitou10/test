set names utf8;
set foreign_key_checks = 0;
drop database if exists zen;

create database if not exists zen;
use zen;

/*
 * 会員情報テーブル
 */
drop table if exists user_info;

create table user_info(
id int not null primary key auto_increment,
user_id varchar(16) not null unique,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32)not null,
first_name_kana varchar(32)not null,
sex tinyint default 0,
email varchar(50) not null,
logined tinyint default 0,
regist_date datetime not null,
update_date datetime
);


/*
 * 商品情報テーブル
 */
drop table if exists product_info;

create table product_info(
id int not null primary key auto_increment,
product_id int not null unique,
product_name varchar(100) not null unique,
product_name_kana varchar(100) not null unique,
product_description varchar(255) not null,
keywords varchar(255),
category_id int not null,
price int,
stock int,
image_file_path varchar(100),
image_file_name varchar(50)unique,
release_date date not null,
release_company varchar(50),
regist_date datetime not null,
update_date datetime
);


/*
 * カート情報テーブル
 */
drop table if exists cart_info;

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
temp_user_id varchar(128),
product_id int not null,
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime
);


/*
 * 購入履歴情報テーブル
 */
drop table if exists purchase_history_info;

create table purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
product_name varchar(100) not null,
product_name_kana varchar(100) not null,
product_count int not null,
price int not null,
image_file_path varchar(100),
release_company varchar(50),
regist_date datetime not null,
update_date datetime
);


/*
 * 宛先情報テーブル
 */
drop table if exists destination_info;

create table destination_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32)not null,
first_name_kana varchar(32)not null,
email varchar(50) not null,
tel_number varchar(32) not null,
user_address varchar(100) not null,
regist_date datetime not null,
update_date datetime
);


/*
 * お問い合わせテーブル
 */
drop table if exists inquiry;

create table inquiry(
id int not null primary key auto_increment,
name varchar(255) not null,
mailaddress varchar(255) not null,
qtype varchar(50),
body varchar(255)not null
);

insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("jiro","1234","田中","次郎","タナカ","ジロウ","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser01","2345","田中","次郎1","タナカ","ジロウ1","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser02","3456","田中","次郎2","タナカ","ジロウ2","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser03","4567","田中","次郎3","タナカ","ジロウ3","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser04","5678","田中","次郎4","タナカ","ジロウ4","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser05","6789","田中","次郎5","タナカ","ジロウ5","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser06","7890","田中","次郎6","タナカ","ジロウ6","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser07","8901","田中","次郎7","タナカ","ジロウ7","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser08","9012","田中","次郎8","タナカ","ジロウ8","0","yyyy@gmail.com",now());
insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date)VALUES("testuser09","0123","田中","次郎9","タナカ","ジロウ9","0","yyyy@gmail.com",now());
insert into product_info(product_id, product_name, product_name_kana, product_description, keywords, category_id, price, stock, image_file_path, image_file_name, release_date, release_company, regist_date)
values(1, "森伊蔵", "もりいぞう", "芋焼酎の独特な臭みの無い、まろやかな味わい。ファーストクラスの機内食にも採用されています。アルコール度数25。", "酒 芋 焼酎", 1, 20000, 10, "./images/moriizou.jpg", "moriizou.jpg", "2010/04/07/", "森伊蔵酒造", now()),
(2, "魔王", "まおう", "臭みもクセもなく、フルーティで飲みやすい焼酎です。女性からの人気も強い焼酎です。麹として米麹を用いておりアルコール度数25。", "酒 芋 焼酎", 1, 13000, 10, "./images/maou.jpg", "maou.jpg", "2010/04/07/", "白玉醸造", now()),
(3, "村尾", "むらお", "製造は全て一人で、伝統的な造りである「かめ壺仕込み」で作る焼酎です。アルコール度数25。ナチュラルな状態で発酵が行われ、まろやかな味わいになります。", "酒 芋 焼酎", 1, 10000, 10, "./images/murao.jpg", "murao.jpg", "2010/04/07/", "村尾酒造", now()),
(4, "百年の孤独", "ひゃくねんのこどく", "色は薄い琥珀色で香りもウイスキーなどの洋酒に近く、甘みもあり麦の香ばしさが広がります。風味を楽しむタイプの焼酎ためストレートやロックで飲まれることが多いです。アルコール度数40。", "酒 麦 焼酎", 1, 11000, 10, "./images/hyakunen.jpg", "hyakunen.jpg", "2010/04/07/", "黒木本店", now()),
(5, "DIAMOND AKATSUKI", "だいやもんど あかつき", "ふくよかで透明感のある美しい酒質で、酒蔵のあらゆる技術と手間を惜しみなく注ぎ込んだ『液体のダイヤモンド』の名にふさわしい美酒です。アルコール度数16。", "酒 日本酒", 2, 32400, 10, "./images/diamondakatsuki.jpg", "diamondakatsuki.jpg", "2010/04/07/", "勝山酒造", now()),
(6, "獺祭 磨き その先へ", "だっさい みがき そのさき", "純米大吟醸の持つ香りやふくらみなどを最大限に表現しました。すっきりとした飲み口でフルーティーな香り、余韻はほんのりと酸味が感じられる気品ある味わいです。アルコール度数16％。", "酒 日本酒", 2, 32400, 10, "./images/dassai.jpg", "dassai.jpg", "2010/04/07/", "旭酒造", now()),
(7, "15年熟成 柏盛", "じゅうごねんじゅくせいかしわざかり", "日光の湧き水と澄んだ空気から生まれた柏盛原酒をマイナス５度に保たれた冷凍コンテナにて１５年間もの間寝かせた熟成日本酒です。この日本酒は年間に５本しか出荷されない超限定の希少な日本酒です。アルコール度数19。", "酒 日本酒", 2, 50000, 10, "./images/kasiwazakari.jpg", "kasiwazakari.jpg", "2010/04/07/", "片山酒蔵", now()),
(8, "菊理媛", "くくりひめ", "菊姫がその年に最高の出来栄えだと認めた吟醸酒を、そこから十年余り熟成させた日本酒であり、まさに菊姫の中の菊姫と言える最上級の逸品、一般的な日本酒には存在しない老ね香りや老ね味を持っています。アルコール度数16。", "酒 日本酒", 2, 47800, 10, "./images/kukurihime.jpg", "kukurihime.jpg", "2010/04/07/", "松本酒店", now()),
(9, "山崎50年", "やまざきごじゅうねん", "香木の伽羅を思わせる芳香や、よく熟した果物のような甘やかでかつ豊かな熟成香が広がります。口当たりは力強く円やかで、絹のように滑らかなコク、ごくかすかな燻製香とともに甘く濃厚な余韻がつづきます。150年限定生産の超プレミア商品です。アルコール度数57。", "酒 ウィスキー", 3, 1000000, 1, "./images/yamazaki.jpg", "yamazaki.jpg", "2010/04/07/", "サントリー", now()),
(10, "軽井沢1960年", "かるいざわせんきゅうひゃくろくじゅうねん", "すでに生産終了しており、半世紀以上の熟成全41本のみの生産されました。うち一本を限定入荷しました。発売当時は、香りは「秋の古い森」を思わせ、味は「濃いベリー類」を思わせると評価されています。", "酒 ウィスキー", 3, 3000000, 1, "./images/karuizawa.jpg", "karuizawa.jpg", "2010/04/07/", "大黒葡萄酒", now()),
(11, "イチローズモルト エース・オブ・スペード", "いちろーずもると えーす おぶ すぺーど", "ミズナラで作成した樽で熟成させると、お香を思わせるオリエンタルな香りがし、世界のウィスキー愛好家に親しまれています。短い熟成期間にも関わらずフルーティでバランスの良い仕上がりです。アルコール度数55％。", "酒 ウィスキー", 3, 1000000, 1, "./images/itiro.jpg", "itiro.jpg", "2010/04/07/", "ベンチャーウイスキー", now()),
(12, "響 35年 碧陽", "ひびき さんじゅうごねん へきよう", "花のような香りや香木のような芳しい香りがし、口当たりは極めてやわらかく、なめらか味わいに仕上がっています。特殊なビンに入っている限定150本のうち一本を限定入荷しました。アルコール度数43。", "酒 ウィスキー", 3, 1000000, 1, "./images/hibiki.jpg", "hibiki.jpg", "2010/04/07/", "サントリー", now()),
(13, "登美〈ノーブルドール〉2008", "とみ のーぶるどーる", "貴腐ワイン特有の蜜やナッツなどのエレガントな香りと、深みのある芳醇で甘美な味わいは、熟成に約8年かけたノーブルドールならではです。アルコール度数9％。", "酒 白 ワイン", 4, 8000, 10, "./images/tomi.jpg", "tomi.jpg", "2010/04/07/", "サントリー", now()),
(14, "甲州 酵母の泡", "こうしゅう こうぼのあわ", "甲州種特有の上品な香りと柔らかな酸味がバランスよく、心地よい口あたりで飲み口の良さが特長です。伊勢志摩サミットでも提供された、どんな料理にも合うスパークリングワインです。アルコール度数11。", "酒 白 ワイン", 4, 2000, 10, "./images/koubo.jpg", "koubo.jpg", "2010/04/07/", "キッコーマン", now()),
(15, "登美の丘＜赤＞", "とみのおか あか", "チェリーなど酸味のある赤系果実の香りに加えて、バラやスミレなどの花の香り、さらに樽由来のコーヒー香が感じられます。そのやわらかなタンニンと、フレッシュで伸びやかな果実味のバランスが心地よい味わいです。ANAのファーストクラスで提供される一品です。アルコール度数12％。", "酒 赤 ワイン", 4, 5000, 10, "./images/tominooka.jpg", "tominooka.jpg", "2010/04/07/", "サントリー", now()),
(16, "マリコ・ヴィンヤード オムニス", "まりこヴぃんやーど おむにす", "カシス、ブラックベリー、ブルーベリーなど黒い果実の香りが豊かに感じられ、また、ヴァニラやスパイスの香りがこのワインの香りに複雑さと奥行きを与えています。豊かな果実感としっかりとしたタンニンがバランスよく感じられ、今後の瓶熟成によりさらなる味わいの進化が期待されます。海外からの技術を取り入れながら、日本らしさを失わないワインです。アルコール度数12.5％。", "酒 赤 ワイン", 4, 25000, 1, "./images/mariko.jpg", "mariko.jpg", "2010/04/07/", "KIRIN", now()),
(17, "五島産最高級からすみ", "ごとうさんさいこうきゅうからすみ", "スライスされたからすみを口に運ぶと、チーズのような、塩辛のような、なんともいえぬ濃厚な味わいがゆっくりと広がります。", "おつまみ つまみ", 2, 25000, 5, "./images/karasumi.jpg", "karasumi.jpg", "2010/04/07/", "五島", now()),
(18, "ドンキーチーズ（1ｋｇ）", "どんきーちーず", "一頭から一日に2デシリットルしか取れないロバのチーズです。", "おつまみ つまみ", 4, 105000, 10, "./images/donki.jpg", "donki.jpg", "2010/04/07/", "セルビア共和国 ザサヴィツァ自然保護区", now()),
(19, "宮崎キャビアクリスタル1983クリスタル", "みやざききゃびあくりすたる", "シロチョウザメ卵径に拘らず、上質の卵を厳選した最高級フレッシュキャビア。", "おつまみ つまみ", 3, 25000, 5, "./images/kyabia.jpg", "kyabia.jpg", "2010/04/07/", "ジャパンキャビア", now()),
(20, "神戸牛 ビーフジャーキー（20ｇ）", "こうべぎゅう びーふじゃーきー", "ひと口召し上がるだけで「肉の違い」を存分に感じる、ジューシーで柔らかなビーフジャーキーです。", "おつまみ つまみ", 3, 3000, 10, "./images/bihu.jpg", "bihu.jpg", "2010/04/07/", "辰屋", now()),
(21, "いぶりがっこ", "いぶりがっこ", "米ぬかと塩を主体に伝承の製法で漬け上げました。ナラの木、桜の焚き木干し、秋田の風土が育んだ独特の風味が楽しめます。", "おつまみ つまみ", 2, 1000, 20, "./images/iburigakko.jpg", "iburigakko.jpg", "2010/04/07/", "雄勝野きむらや", now()),
(22, "キングソーセージ", "きんぐそーせーじ", "馬肉・国産豚肉・牛肉を独自配合により、じっくり乾燥を行ったロングセラーのドライソーセージです。", "おつまみ つまみ", 4, 3000, 20, "./images/hujihamu.jpg", "hujihamu.jpg", "2010/04/07/", "冨士ハム", now()),
(23, "カカオ ブラン ドゥ リリュジョン", "かかお ぶらん どぅ りりゅじょん", "“幻のホワイトカカオ”を使用し素材を最大限に活かしたシェフ渾身の逸品です。", "おつまみ つまみ", 3, 1800, 20, "./images/choco.jpg", "choco.jpg", "2010/04/07/", "LE CHOCOLAT DE H", now()),
(24, "梅干＜はちみつ仕立て【極】＞", "うめぼし はちみつしたて きわめ", "梅干をひと粒ずつ和紙で包んだ贅沢な逸品です。塩分8％で食べやすく、肉厚の4Lを個包装しています。", "おつまみ つまみ", 2, 6400, 10, "./images/umeboshi.jpg", "umeboshi.jpg", "2010/04/07/", "勝喜梅", now()),
(25, "幻の高級魚、のどぐろ干物詰合せセット", "まぼろしのこうきゅうぎょ のどぐろひものつめあわせせっと", "旬の時期の脂ののりは、トロにも匹敵する美味しさと、漁獲量の少なさから幻の高級魚とも言われるほどののどぐろ。伝統の技術でのどぐろ本来の風味と美味しさを召し上がっていただけるように、干し加減、塩加減を調整して一夜干しに仕上げました。", "おつまみ つまみ", 1, 6400, 10, "./images/nodoguro.jpg", "nodoguro.jpg", "2010/04/07/", "干物海産物通販かすみ屋", now()),
(26, "天然出汁めんたい子「天」一本売り", "てんねんだしめんたいこ てん いっぽんうり", "店主がこだわりの全てをかけた辛子明太子「天」を一本一本丁寧に包装し桐箱に詰めております。大ぶりでぷちぷち感をもった厳選の真子をお楽しみください。", "おつまみ つまみ", 1, 3700, 10, "./images/ten.jpg", "ten.jpg", "2010/04/07/", "辛子明太子のあき津゛", now()),
(27, "セルフィユ 国産小麦クラッカー", "せるふぃゆ こくさんこむぎくらっかー", "国産小麦のみを使用し、香ばしく焼き上がっています。ディップに最適なのはもちろんのこと、そのままで召し上がっても小麦の風味を楽しめます。", "おつまみ つまみ", 4, 1000, 20, "./images/kurakka-.jpg", "kurakka-.jpg", "2010/04/07/", "セルフィユ軽井沢", now()),
(28, "缶つま極 三重県産あわび水煮", "かんつまきわめ みえけんさんあわびみずに", "アワビの旨みを引き出すよう煮込み、慎重にスライスをし贅沢に缶詰にしました。磯の風景が目に浮かぶような香りとふくよかなあまみをお楽しみ下さい。限定生産品です。", "おつまみ つまみ", 2, 12800, 10, "./images/kantsuma.jpg", "kantsuma.jpg", "2010/04/07/", "国分グループ", now()),
(29, "賀兵衛・暁", "かへい あかつき", "天日干ししてから漬け込むことにより、旨みを凝縮し、味わいに深みを出しています。天瀬戸内の焼塩を使用し、カドのないまるみのある仕上がりに。いかの風味と旨みを堪能できる、芳醇かつ濃厚な旨みが特徴です。", "おつまみ つまみ", 1, 2000, 20, "./images/kaheiakatsuki.jpg", "kaheiakatsuki.jpg", "2010/04/07/", "駿河屋賀兵衛", now()),
(30, "トリュフナッツ", "とりゅふなっつ", "袋を開けただけでトリュフの香りが鼻孔をくすぐり、それを口にすれば、口の中いっぱいにトリュフの香りが広がります。", "おつまみ つまみ", 3, 2000, 20, "./images/nuts.jpg", "nuts.jpg", "2010/04/07/", "Groovy Nuts", now()),
(31, "最高級 極上肉厚 一夜干しするめ5枚入", "さいこうきゅう ごくじょうにくあつ いちやぼしするめごまいいり", "北海道の函館で水揚げ間もない、最高のスルメイカを厳選して天日干しにしたもの。噛めば噛むほど味がでる最高級 肉厚スルメです。", "おつまみ つまみ", 1, 9000, 20, "./images/surume.jpg", "surume.jpg", "2010/04/07/", "北海道 小町商店", now()),
(32, "黒毛和牛サーロインローストビーフ", "くろげわぎゅうさーろいんろーすとびーふ", "冷凍便で届くので食べる日の前日には冷蔵庫においてゆっくり解凍を。よく切れる包丁で好みの厚さにスライスし付属の特製ソースとレホール（西洋わさび）でお召し上がりください。", "おつまみ つまみ", 4, 24000, 10, "./images/roast beef.jpg", "roast beef.jpg", "2010/04/07/", "鎌倉山", now());
