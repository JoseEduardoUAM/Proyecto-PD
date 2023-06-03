CREATE DATABASE IF NOT EXISTS Manager_Products;

CREATE TABLE IF NOT EXISTS Manager_Products.Family(
    idFamily INTEGER NOT NULL AUTO_INCREMENT,
    nameFamily VARCHAR(20) NOT NULL,
    PRIMARY KEY(idFamily)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Sensor(
    idSensor INTEGER NOT NULL AUTO_INCREMENT,
    nameSensor VARCHAR(20) NOT NULL,
    PRIMARY KEY(idSensor)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Processor(
    idProcessor INTEGER NOT NULL AUTO_INCREMENT,
    nameProcessor VARCHAR(20) NOT NULL,
    speed INTEGER NOT NULL,
    PRIMARY KEY(idProcessor)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Screen(
    idScreen INTEGER NOT NULL AUTO_INCREMENT,
    nameScreen VARCHAR(20) NOT NULL,
    PRIMARY KEY(idScreen)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Model(
    idModel INTEGER NOT NULL AUTO_INCREMENT,
    nameModel VARCHAR(20) NOT NULL,
    idFamily INTEGER,
    PRIMARY KEY(idModel),
    FOREIGN KEY(idFamily) REFERENCES Family(idFamily)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Tablet(
    idTablet INTEGER NOT NULL AUTO_INCREMENT,
    idScreen INTEGER NOT NULL,
    idModel INTEGER NOT NULL,
    idProcessor INTEGER NOT NULL,
    dimension varchar(20) NOT NULL,
    sizeStorage INTEGER NOT NULL,
    color VARCHAR(15) NOT NULL,
    PRIMARY KEY(idTablet),
    FOREIGN KEY(idScreen) REFERENCES Screen(idScreen),
    FOREIGN KEY(idModel) REFERENCES Model(idModel),
    FOREIGN KEY(idProcessor) REFERENCES Processor(idProcessor)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Smartphone(
    idSmartphone INTEGER NOT NULL AUTO_INCREMENT,
    idScreen INTEGER NOT NULL,
    idModel INTEGER NOT NULL,
    idProcessor INTEGER NOT NULL,
    dimension varchar(20),
    sizeStorage INTEGER NOT NULL,
    color VARCHAR(15),
    numberSIM INTEGER NOT NULL,
    PRIMARY KEY(idSmartphone),
    FOREIGN KEY(idScreen) REFERENCES Screen(idScreen),
    FOREIGN KEY(idModel) REFERENCES Model(idModel),
    FOREIGN KEY(idProcessor) REFERENCES Processor(idProcessor)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Smartwatch(
    idSmartwatch INTEGER NOT NULL AUTO_INCREMENT,
    idScreen INTEGER NOT NULL,
    idModel INTEGER NOT NULL,
    idProcessor INTEGER NOT NULL,
    dimension varchar(20),
    sizeStorage INTEGER NOT NULL,
    PRIMARY KEY(idSmartwatch),
    FOREIGN KEY(idScreen) REFERENCES Screen(idScreen),
    FOREIGN KEY(idModel) REFERENCES Model(idModel),
    FOREIGN KEY(idProcessor) REFERENCES Processor(idProcessor)
);

CREATE TABLE IF NOT EXISTS Manager_Products.SmartTV(
    idSmartTV INTEGER NOT NULL AUTO_INCREMENT,
    idScreen INTEGER NOT NULL,
    idModel INTEGER NOT NULL,
    idProcessor INTEGER NOT NULL,
    dimension varchar(20),
    sizeStorage INTEGER NOT NULL,
    weightSmartTV FLOAT(6,2) NOT NULL,
    PRIMARY KEY(idSmartTV),
    FOREIGN KEY(idScreen) REFERENCES Screen(idScreen),
    FOREIGN KEY(idModel) REFERENCES Model(idModel),
    FOREIGN KEY(idProcessor) REFERENCES Processor(idProcessor)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Product_Sensor(
    idModel INTEGER NOT NULL AUTO_INCREMENT,
    nameModel VARCHAR(20) NOT NULL,
    idFamily INTEGER,
    PRIMARY KEY(idModel),
    FOREIGN KEY(idFamily) REFERENCES Family(idFamily)
);

CREATE TABLE IF NOT EXISTS Manager_Products.FactoryError(
    idFactoryError INTEGER NOT NULL AUTO_INCREMENT,
    nameFactoryError VARCHAR(20) NOT NULL,
    PRIMARY KEY(idFactoryError)
);

CREATE TABLE IF NOT EXISTS Manager_Products.State(
    idState INTEGER NOT NULL AUTO_INCREMENT,
    nameState VARCHAR(20) NOT NULL,
    PRIMARY KEY(idState)
);

CREATE TABLE IF NOT EXISTS Manager_Products.Inventory(
    idInventory INTEGER NOT NULL AUTO_INCREMENT,
    idState INTEGER,
    idSmartphone INTEGER,
    idSmartwatch INTEGER,
    idTablet INTEGER,
    idSmartTV INTEGER,
    PRIMARY KEY(idInventory),
    FOREIGN KEY(idState) REFERENCES State(idState),
    FOREIGN KEY(idSmartphone) REFERENCES Smartphone(idSmartphone),
    FOREIGN KEY(idSmartwatch) REFERENCES Smartwatch(idSmartwatch),
    FOREIGN KEY(idTablet) REFERENCES Tablet(idTablet),
    FOREIGN KEY(idSmartTV) REFERENCES SmartTV(idSmartTV)
);