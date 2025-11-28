CREATE TABLE HOBBY
(
    ID          INT PRIMARY KEY AUTO_INCREMENT,
    NAME        VARCHAR(255),
    DESCRIPTION VARCHAR(255)
);

CREATE TABLE RATING
(
    ID       INT PRIMARY KEY AUTO_INCREMENT,
    USERNAME VARCHAR(255),
    RATING    INT,
    DESCRIPTION VARCHAR(255)
);

INSERT INTO HOBBY (NAME, DESCRIPTION)
VALUES ('Fotografie', 'Das Festhalten von Momenten mit einer Kamera.'),
       ('Gartenarbeit', 'Das Anbauen und Pflegen von Pflanzen und Blumen.'),
       ('Brettspiele', 'Spielen von Gesellschaftsspielen mit Freunden und Familie.'),
       ('Programmieren', 'Das Erstellen von Software und Anwendungen.'),
       ('Wandern', 'Das Erkunden von Naturwegen und Landschaften.'),
       ('Kochen', 'Die Zubereitung von Speisen und kulinarischen Experimenten.'),
       ('Schreiben', 'Das Verfassen von Geschichten, Gedichten oder Blogs.'),
       ('Musik machen', 'Das Spielen eines Instruments oder das Singen.'),
       ('Radfahren', 'Das Fahren auf einem Fahrrad in der Natur oder auf Straßen.'),
       ('Malerei', 'Das Erstellen von Kunstwerken mit Farben und Pinsel.');

INSERT INTO RATING (USERNAME, RATING, DESCRIPTION)
VALUES ('MaxMustermann', 5, 'Mehr Bilder'),
       ('LisaMuster', 5,'test'),
       ('PeterBeispiel', 4, 'abc'),
       ('AnnaDemo', 4, 'super Seite');
