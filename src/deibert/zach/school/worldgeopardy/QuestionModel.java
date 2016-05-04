/*
 * Copyright (c) 2015, Zach Deibert, Andrew Krenzel, and Mark Garcia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package deibert.zach.school.worldgeopardy;

public class QuestionModel {
    public static final Category categories[] = new Category[] {
        new Category(
            "Islam",
            new Question[] {
                new Question(
                    "What are the worshippers of Islam called?",
                    new String[] {
                        "Islams",
                        "Muslims",
                        "Christians",
                        "Jews"
                    },
                    1
                ),
                new Question(
                    "Who started the Islamic religion?",
                    new String[] {
                        "Jesus",
                        "Peter",
                        "Paul",
                        "Mohammad",
                        "Abraham"
                    },
                    3
                ),
                new Question(
                    "Which of the following are pillars of Islam?\n"
                            + "  I.   Shahada\n"
                            + "  II.  The Ten Commandments\n"
                            + "  III. Yom Kippur\n"
                            + "  IV.  Prayer\n",
                    new String[] {
                        "I only",
                        "II only",
                        "II and I",
                        "III only",
                        "I and III",
                        "II and III",
                        "I, II, and III",
                        "IV only",
                        "I and IV",
                        "II and IV",
                        "I, II, and IV",
                        "III and IV",
                        "I, III, and IV",
                        "II, III, and IV",
                        "I, II, III, and IV"
                    },
                    8
                ),
                new Question(
                    "How many times do they pray?",
                    new String[] {
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "It depends",
                        "However many times they want"
                    },
                    4
                ),
                new Question(
                    "Where is Mecca?",
                    new String[] {
                        "Saudi Arabia",
                        "Jerusalem",
                        "Greenland",
                        "Rwanda"
                    },
                    0
                )
            }
        ),
        new Category(
            "Judaism",
            new Question[] {
                new Question(
                    "What does Kosher mean?",
                    new String[] {
                        "It is okay for them to read",
                        "It is not okay for them to read",
                        "It is okay for them to eat",
                        "It is not okay for them to eat"
                    },
                    2
                ),
                new Question(
                    "What are followers of Judaism called?",
                    new String[] {
                        "Islams",
                        "Muslims",
                        "Christians",
                        "Jews"
                    },
                    3
                ),
                new Question(
                    "What does the Passover celebrate?",
                    new String[] {
                        "The invention of computers",
                        "The escape from slavery in Egypt",
                        "The birth of Jesus",
                        "The day before Jesus was crucified"
                    },
                    1
                ),
                new Question(
                    "What are the sacred writings of Judaism called?",
                    new String[] {
                        "Bible",
                        "Ten Commandments",
                        "Torah",
                        "Qu'aran"
                    },
                    2
                ),
                new Question(
                    "What type of calendar do they use?",
                    new String[] {
                        "Leap-week Calendar",
                        "Lunar Calendar",
                        "Islamic calendar",
                        "Hindu calendar"
                    },
                    1
                )
            }
        ),
        new Category(
            "Holy Sites",
            new Question[] {
                new Question(
                    "Which sacred site is at the same spot as the Temple Mount?",
                    new String[] {
                        "Church of the Holy Sepulchre",
                        "The Wailing Wall",
                        "Mount Zion",
                        "Via Dolorosa",
                        "Dome of Rock",
                        "Mount of Olives"
                    },
                    4
                ),
                new Question(
                    "Which sites are sacred to Jews?\n"
                            + "  I.   Temple Mount/Haram al-Sharif\n"
                            + "  II.  Church of the Holy Sepulcher\n"
                            + "  III. Via Dolorosa\n"
                            + "  IV.  Mount Zion",
                    new String[] {
                        "I only",
                        "II only",
                        "II and I",
                        "III only",
                        "I and III",
                        "II and III",
                        "I, II, and III",
                        "IV only",
                        "I and IV",
                        "II and IV",
                        "I, II, and IV",
                        "III and IV",
                        "I, III, and IV",
                        "II, III, and IV",
                        "I, II, III, and IV"
                    },
                    8
                ),
                new Question(
                    "Which sites are sacred to Christians?\n"
                            + "  I.   Temple Mount/Haram al-Sharif\n"
                            + "  II.  Church of the Holy Sepulcher\n"
                            + "  III. Via Dolorosa\n"
                            + "  IV.  Mount Zion",
                    new String[] {
                        "I only",
                        "II only",
                        "II and I",
                        "III only",
                        "I and III",
                        "II and III",
                        "I, II, and III",
                        "IV only",
                        "I and IV",
                        "II and IV",
                        "I, II, and IV",
                        "III and IV",
                        "I, III, and IV",
                        "II, III, and IV",
                        "I, II, III, and IV"
                    },
                    13
                ),
                new Question(
                    "Which sites are sacred to Muslims?\n"
                            + "  I.   Temple Mount/Haram al-Sharif\n"
                            + "  II.  Church of the Holy Sepulcher\n"
                            + "  III. Via Dolorosa\n"
                            + "  IV.  Mount Zion",
                    new String[] {
                        "I only",
                        "II only",
                        "II and I",
                        "III only",
                        "I and III",
                        "II and III",
                        "I, II, and III",
                        "IV only",
                        "I and IV",
                        "II and IV",
                        "I, II, and IV",
                        "III and IV",
                        "I, III, and IV",
                        "II, III, and IV",
                        "I, II, III, and IV"
                    },
                    0
                ),
                new Question(
                    "Which site is the most holy for Jews?",
                    new String[] {
                        "Temple Mount/Haram al-Sharif",
                        "Church of the Holy Sepulcher",
                        "Via Dolorosa",
                        "Mount Zion",
                        "Western Wall",
                        "Dome of Rock",
                        "As Aqsa Mosque",
                        "Mount of Olives"
                    },
                    4
                )
            }
        ),
        new Category(
            "Thematic Maps",
            new Question[] {
                new Question(
                    "Which country have the lowest literacy rate in this map?\n"
                            + "http://www.mapsoftheworld.com/asia/thematic/maps/asia-literacy-rate.jpg",
                    new String[] {
                        "China",
                        "India",
                        "Iran",
                        "Saudi Arabia"
                    },
                    1
                ),
                new Question(
                    "Which country have the highest literacy rate in this map?\n"
                            + "http://www.mapsoftheworld.com/asia/thematic/maps/asia-literacy-rate.jpg",
                    new String[] {
                        "China",
                        "India",
                        "Iran",
                        "Saudi Arabia"
                    },
                    0
                ),
                new Question(
                    "Which country do you think has the best education system?\n"
                            + "http://www.mapsoftheworld.com/asia/thematic/maps/asia-literacy-rate.jpg",
                    new String[] {
                        "Turkey",
                        "Pakistan",
                        "Israel",
                        "Myanmar"
                    },
                    2
                ),
                new Question(
                    "Which country do you think has the worst education system?\n"
                            + "http://www.mapsoftheworld.com/asia/thematic/maps/asia-literacy-rate.jpg",
                    new String[] {
                        "Turkey",
                        "Pakistan",
                        "Israel",
                        "Myanmar"
                    },
                    1
                ),
                new Question(
                    "Which region of Asia has the best education?\n"
                            + "http://www.mapsoftheworld.com/asia/thematic/maps/asia-literacy-rate.jpg",
                    new String[] {
                        "North",
                        "North East",
                        "East",
                        "South East",
                        "South",
                        "South West",
                        "West",
                        "North West",
                        "Central"
                    },
                    1
                )
            }
        ),
        new Category(
            "I-P Conflict",
            new Question[] {
                new Question(
                    "Who are in conflict in the Middle East?\n"
                            + "  I.   The US\n"
                            + "  II.  Israel\n"
                            + "  III. Palestine\n"
                            + "  IV.  Britain",
                    new String[] {
                        "I only",
                        "II only",
                        "II and I",
                        "III only",
                        "I and III",
                        "II and III",
                        "I, II, and III",
                        "IV only",
                        "I and IV",
                        "II and IV",
                        "I, II, and IV",
                        "III and IV",
                        "I, III, and IV",
                        "II, III, and IV",
                        "I, II, III, and IV"
                    },
                    5
                ),
                new Question(
                    "Where are rockets launched from every day?",
                    new String[] {
                        "Gaza",
                        "The US",
                        "Egypt",
                        "Russia"
                    },
                    0
                ),
                new Question(
                    "What is The Iron Dome?",
                    new String[] {
                        "Half a shpere made of iron",
                        "A system that allows Gaza to launch missiles at Israel",
                        "A system that allows Israel to launch missiles at Gaza",
                        "A system that allows Gaza to block missiles from Israel",
                        "A system that allows Israel to block missiles from Gaza"
                    },
                    4
                ),
                new Question(
                    "What are they fighting for?",
                    new String[] {
                        "Israel",
                        "Palestine",
                        "War",
                        "Land",
                        "Money"
                    },
                    3
                ),
                new Question(
                    "What has changed since the Balfour Declaration?",
                    new String[] {
                        "Israel got more land",
                        "Palestine got more land",
                        "Israel and Palestine got more land",
                        "Other"
                    },
                    0
                )
            }
        )
    };
    
    public static final Question finalQuestion = new Question(
        "What did the Bal4 Declaration allow 4?",
        new String[] {
            "The creation of a Jewish homeland in Palestine",
            "The creation of a Palestinian homeland in Jerusalem",
            "The creation of a Jewish homeland in Jerusalem",
            "The creation of a Palestinian homeland in Palestine",
            "The removal of the Jewish homeland in Palestine",
            "The removal of the Palestinian homeland in Jerusalem",
            "The removal of the Jewish homeland in Palestine",
            "The removal of the Palestinian homeland in Jerusalem"
        },
        0
    );
}
