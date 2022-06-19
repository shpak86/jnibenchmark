//
// Created by Шпаковский Антон Алексеевич on 17.06.2022.
//

#ifndef RAINBOW_CSORTER_H
#define RAINBOW_CSORTER_H

#include "iostream"
#include <stdlib.h>

class csorter {
public:
    static const int ARRAY_SIZE = 65536;
    int items[ARRAY_SIZE];

    csorter() {
        srand(time(NULL));   // Initialization, should only be called once.
        for (int i = 0; i < ARRAY_SIZE; i++) {
            items[i] = rand();
        }
    }

    void bubble(void) {
        bool isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < ARRAY_SIZE - 1; i++) {
                if (items[i] > items[i + 1]) {
                    isSorted = false;
                    int tmp = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = tmp;
                }
            }
        }
    }

};

#endif //RAINBOW_CSORTER_H
