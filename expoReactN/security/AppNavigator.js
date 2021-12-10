import {NavigationContainer} from "@react-navigation/native";
import MainPage from "../Components/pages/MainPage/MainPage";
import React from "react";
import {createStackNavigator} from "@react-navigation/stack";
import ProfilePage from "../Components/pages/ProfilePage";
import AboutDream from "../Components/pages/AboutDream";
import MakeDream from "../Components/pages/MakeDream";

const Stack = createStackNavigator();

export const AppNavigator = () => {
    return (
        <NavigationContainer>
            <Stack.Navigator options={{
                cardStyle: {
                    backgroundColor: 'white',
                }
            }}>
                <Stack.Screen
                    name="MainPage"
                    component={MainPage}
                    options={{
                        headerShown: false,
                        cardStyle: {
                            backgroundColor: 'white',
                        }
                    }
                    }
                />
                <Stack.Screen
                name="ProfilePage"
                component={ProfilePage}
                options={{
                    title: 'Профиль',
                    cardStyle: {
                        backgroundColor: 'white',
                    }
                }
                }
            />
                <Stack.Screen
                    name="AboutDream"
                    component={AboutDream}
                    options={{
                        title: 'Мечта',
                        cardStyle: {
                            backgroundColor: 'white',
                        }
                    }
                    }
                />
                <Stack.Screen
                    name="MakeDream"
                    component={MakeDream}
                    options={{
                        title: 'Создать мечту',
                        cardStyle: {
                            backgroundColor: 'white',
                        }
                    }
                    }
                />
            </Stack.Navigator>
        </NavigationContainer>
    )

}