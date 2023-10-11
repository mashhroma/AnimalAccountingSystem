USE human_friends;

INSERT INTO `nursery`
	(name)
VALUES
	('pets'),
	('pack_animals')
	;
    
INSERT INTO `animal_types`
	(name, nursery)
VALUES
	('dog', 1),
    ('cat', 1),
    ('hamster', 1),
    ('horse', 2),
    ('camel', 2),
	('donkey', 2)
	;
    
INSERT INTO `dogs`
	(type, name, birthday, commands)
VALUES
	(1, 'Шарик', '2020-05-03', 'gav-gav, lie, sit'),
    (1, 'Бобик', '2018-06-23', 'aport, gav-gav, sit'),
    (1, 'Майло', '2021-10-15', 'aport, gav-gav'),
    (1, 'Ася', '2019-03-10', 'gav-gav, lie, sit'),
	(1, 'Ириска', '2018-09-08', 'aport, gav-gav, lie')
	;
    
INSERT INTO `cats`
	(type, name, birthday, commands)
VALUES
	(2, 'Мурзик', '2015-07-03', 'meow-meow, sleep, jump'),
    (2, 'Муся', '2019-05-22', 'meow-meow, sleep'),
    (2, 'Симба', '2018-11-17', 'meow-meow, sleep'),
    (2, 'Гарфилд', '2022-07-10', 'meow-meow, sleep, jump'),
	(2, 'Чубайс', '2020-09-05', 'meow-meow, sleep, jump')
	;
    
INSERT INTO `hamsters`
	(type, name, birthday, commands)
VALUES
	(3, 'Пушистик', '2020-08-05', 'wheelspin, stand'),
    (3, 'Кокос', '2021-03-15', 'wheelspin'),
    (3, 'Кнопка', '2021-08-07', 'wheelspin, stand'),
    (3, 'Боня', '2022-05-15', 'wheelspin'),
	(3, 'Винтик', '2021-03-25', 'wheelspin')
	;
    
INSERT INTO `horses`
	(type, name, birthday, commands)
VALUES
	(4, 'Богатырь', '2013-05-12', 'greeting, stand, walk, gallop'),
    (4, 'Ягодка', '2009-07-11', 'greeting, stand, walk, gallop'),
    (4, 'Глория', '2012-03-20', 'greeting, stand, walk'),
    (4, 'Винсент', '2011-04-04', 'greeting, stand, walk, gallop'),
	(4, 'Дункан', '2011-09-12', 'greeting, stand, walk, gallop')
	;
    
INSERT INTO `camels`
	(type, name, birthday, commands)
VALUES
	(5, 'Пол', '2003-04-18', 'spit, lie'),
    (5, 'Мисти', '2007-09-13', 'spit, lie'),
    (5, 'Вифсла', '2005-01-26', 'spit, lie'),
    (5, 'Тимон', '2006-08-14', 'spit, lie'),
	(5, 'Пумба', '2010-02-18', 'spit, lie')
	;
    
INSERT INTO `donkeys`
	(type, name, birthday, commands)
VALUES
	(6, 'Нэльсон', '2020-02-20', 'stand, walk, lie'),
    (6, 'Беатрикс', '2015-08-15', 'stand, walk, lie'),
    (6, 'Авалон', '2019-12-12', 'stand, walk, lie'),
    (6, 'Маркиз', '2017-07-12', 'stand, walk, lie'),
	(6, 'Нарцис', '2019-04-05', 'stand, walk, lie')
	;