# CRUD class model
Basic class structure of the future application, it implements full functionality that app should have

## Motivation

This is the beginning of my requalification course project in which I am creating the class structure of my future project and trying to figure out the basic dependencies between them.

## What problem does it solves

The console project have 6 classes:

- Pojisteny (Insured)
- Adresa (Address)
- Pojisteni (Insurance)
- Udalost (Event)
- Administrator
- Database

 *Pojisteny* (Insured) class has an ArrayList<> of *Pojisteni* (Insurance) and an ArrayList<> of *Udalost*(Events), these ArrayLists replases database tables in future application and store Endurance Events and Insurance information of particular Insured (person).

 *Database class* stores all information about described objects in ArrayLists<> and replaces a database of future applications.

 *Administrator* is allowed to change the content of all these ArrayLists and this describes administration in a real app.

## Features

Console application has functionality same as should future application have:

- Create of Insured person (Pojisteny)
- Create of insurance (Pojisteni)
- Show detail of insured, including his insurance
- Show detail of insurance
- Show list of insured
- Delete insured, include with his insurance
- Delete insurance
- Edit ensured
- Edit insurance of insured

### Moreover it can:

- Create insurance incident
- Show insurance incident
- Delete insurance incident
