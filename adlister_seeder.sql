USE adlister_db;

DESCRIBE users;

INSERT INTO users (username, email, password)
VALUES ('karen', 'karen@up.com', 'secret'),
       ('pibo', 'pibo@up.com', 'whatever123');

SELECT * FROM users;

INSERT INTO ads (title, user_id , description)
VALUES ('Toyota Corolla For Sale', 1, 'It runs'),
       ('MacBook Pro For Sale', 1, 'It does not run'),
       ('Cat For Sale', 1, 'He runs a lot');

SELECT * FROM ads;

DROP TABLE ads;
