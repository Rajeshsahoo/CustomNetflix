package com.example.customnetflix.service;

import com.example.customnetflix.model.ContentRow;
import com.example.customnetflix.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private static final String POSTER = "https://picsum.photos/seed/%s/300/450";

    private String poster(String seed) {
        return String.format(POSTER, seed);
    }

    public Movie getFeatured() {
        return new Movie(
                "Stranger Signals",
                "https://picsum.photos/seed/featured-hero/1280/720",
                "When a quiet town starts receiving messages from another dimension, a group of "
                        + "friends must uncover the truth before the line goes dead forever.",
                2025,
                "TV-14",
                "2 Seasons"
        );
    }

    public List<ContentRow> getContentRows() {
        return List.of(
                new ContentRow("Trending Now", List.of(
                        new Movie("Neon Horizon", poster("neon-horizon"),
                                "A hacker races against time in a city that never sleeps.",
                                2024, "TV-MA", "1h 58m"),
                        new Movie("The Last Orbit", poster("last-orbit"),
                                "Stranded astronauts fight to return home.",
                                2023, "PG-13", "2h 12m"),
                        new Movie("Crimson Lake", poster("crimson-lake"),
                                "A detective unravels a small-town mystery.",
                                2025, "TV-MA", "1 Season"),
                        new Movie("Velvet Empire", poster("velvet-empire"),
                                "Power and betrayal in a glamorous dynasty.",
                                2024, "TV-14", "3 Seasons"),
                        new Movie("Silent Frequency", poster("silent-frequency"),
                                "A sound engineer hears what no one else can.",
                                2022, "R", "1h 45m"),
                        new Movie("Iron Bloom", poster("iron-bloom"),
                                "A blacksmith's daughter ignites a rebellion.",
                                2025, "TV-MA", "1 Season")
                )),
                new ContentRow("Popular on CustomNetflix", List.of(
                        new Movie("Midnight Diner", poster("midnight-diner"),
                                "Stories unfold over late-night meals.",
                                2021, "TV-14", "4 Seasons"),
                        new Movie("Glass Cities", poster("glass-cities"),
                                "Architects dream beyond the skyline.",
                                2023, "PG", "1h 39m"),
                        new Movie("Wild Currents", poster("wild-currents"),
                                "A river guide confronts nature and her past.",
                                2024, "PG-13", "1h 52m"),
                        new Movie("Echo Park", poster("echo-park"),
                                "Friends reconnect after a decade apart.",
                                2022, "TV-MA", "2 Seasons"),
                        new Movie("Paper Kingdoms", poster("paper-kingdoms"),
                                "A cartoonist's drawings come to life.",
                                2025, "TV-G", "1 Season"),
                        new Movie("After the Storm", poster("after-the-storm"),
                                "A family rebuilds in the wake of disaster.",
                                2023, "PG-13", "1h 47m")
                )),
                new ContentRow("New Releases", List.of(
                        new Movie("Quantum Drift", poster("quantum-drift"),
                                "Time travel comes with a deadly price.",
                                2025, "TV-MA", "1 Season"),
                        new Movie("Golden Hour", poster("golden-hour"),
                                "A photographer chases the perfect shot.",
                                2025, "PG", "1h 36m"),
                        new Movie("Black Tide", poster("black-tide"),
                                "A coastal town hides a dark secret.",
                                2025, "TV-MA", "1 Season"),
                        new Movie("Starlit Roads", poster("starlit-roads"),
                                "A road trip that changes everything.",
                                2025, "PG-13", "2h 04m"),
                        new Movie("Frost & Ember", poster("frost-ember"),
                                "Two rivals must survive a frozen wild.",
                                2025, "TV-14", "1 Season"),
                        new Movie("The Archivist", poster("the-archivist"),
                                "A librarian guards humanity's last memories.",
                                2025, "TV-MA", "1 Season")
                )),
                new ContentRow("Award-Winning Dramas", List.of(
                        new Movie("Hollow Crown", poster("hollow-crown"),
                                "A monarch's reign tested by scandal.",
                                2020, "TV-MA", "3 Seasons"),
                        new Movie("The Long Road", poster("the-long-road"),
                                "An immigrant family builds a new life.",
                                2021, "PG-13", "2h 18m"),
                        new Movie("Salt of the Earth", poster("salt-of-the-earth"),
                                "Farmers fight to save their land.",
                                2019, "PG", "2h 02m"),
                        new Movie("Verdict", poster("verdict"),
                                "A courtroom battle for the truth.",
                                2022, "R", "2h 09m"),
                        new Movie("Letters Home", poster("letters-home"),
                                "Wartime letters bridge two hearts.",
                                2020, "TV-14", "1 Season"),
                        new Movie("Still Waters", poster("still-waters"),
                                "Grief and healing in a lakeside town.",
                                2023, "TV-MA", "1 Season")
                )),
                new ContentRow("Action & Adventure", List.of(
                        new Movie("Apex Protocol", poster("apex-protocol"),
                                "An elite squad takes on an impossible mission.",
                                2024, "R", "1h 56m"),
                        new Movie("Thunder Run", poster("thunder-run"),
                                "A heist on the world's fastest train.",
                                2023, "PG-13", "1h 49m"),
                        new Movie("Skyfall Ridge", poster("skyfall-ridge"),
                                "Climbers stranded on a deadly peak.",
                                2022, "PG-13", "2h 01m"),
                        new Movie("Steel Horizon", poster("steel-horizon"),
                                "Mercenaries guard a fragile peace.",
                                2025, "TV-MA", "1 Season"),
                        new Movie("Rogue Tide", poster("rogue-tide"),
                                "A navy diver races to stop a catastrophe.",
                                2024, "PG-13", "2h 07m"),
                        new Movie("Desert Phantom", poster("desert-phantom"),
                                "A lone driver outruns the law.",
                                2023, "R", "1h 43m")
                ))
        );
    }
}
