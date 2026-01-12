package ru.netology.aviatickets;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AviaSoulsTest {

    Ticket ticket1 = new Ticket(
            "Cherepovec",
            "Kaliningrad",
            10_000,
            12,
            16);

    Ticket ticket2 = new Ticket(
            "Moscow",
            "Kaliningrad",
            5_000,
            13,
            15);

    Ticket ticket3 = new Ticket(
            "Kazan",
            "Kaliningrad",
            20_000,
            8,
            15);

    Ticket ticket4 = new Ticket(
            "Samara",
            "Kaliningrad",
            8_000,
            10,
            15);

    Ticket ticket5 = new Ticket(
            "Almaty",
            "Kaliningrad",
            18_000,
            6,
            15);

    Ticket ticket6 = new Ticket(
            "Cherepovec",
            "Kaliningrad",
            11_000,
            13,
            16);

    Ticket ticket7 = new Ticket(
            "Cherepovec",
            "Kaliningrad",
            14_000,
            14,
            15);


    @Test

    public void shouldSearchInOrder() {
        AviaSouls search = new AviaSouls();

        search.add(ticket1);
        search.add(ticket2);
        search.add(ticket3);
        search.add(ticket4);
        search.add(ticket5);
        search.add(ticket6);
        search.add(ticket7);


        Ticket[] expected = {ticket1, ticket6, ticket7};
        Ticket[] actual = search.search("Cherepovec", "Kaliningrad");

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test

    public void shouldCompareInOrder() {
        AviaSouls compare = new AviaSouls();

        compare.add(ticket1);
        compare.add(ticket2);
        compare.add(ticket3);
        compare.add(ticket4);
        compare.add(ticket5);
        compare.add(ticket6);
        compare.add(ticket7);


        Ticket[] expected = {ticket7, ticket6, ticket1};
        Ticket[] actual = compare.searchAndSortBy("Cherepovec", "Kaliningrad", new TicketTimeComparator());
        Assertions.assertArrayEquals(expected, actual);
    }
}


